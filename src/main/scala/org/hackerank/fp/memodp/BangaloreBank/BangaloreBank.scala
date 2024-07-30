package org.hackerank.fp.memodp.BangaloreBank

import java.io.PrintWriter
import scala.io.StdIn

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
     */
    class Lazy[T](expr: => T) {
      lazy val value = expr
      def apply(): T = value
    }
    object Lazy {
      def apply[T](expr: => T) = new Lazy(expr)
    }
    def time(count: Int, digits: Array[Int]): Int = {
      def go(n: Int, l: Int, r: Int): Lazy[Int] = Lazy {
        (n, l, r) match {
          case (0, _, _) => 0
          case (1, _, _) => Seq((digits(count - 1) - l).abs, (digits(count - 1) - r).abs).min + 1
          case _ =>
            1 + Seq(
              mem(n - 1)(digits(count - n))(r)() + (digits(count - n) - l).abs,
              mem(n - 1)(l)(digits(count - n))() + (digits(count - n) - r).abs
            ).min
        }
      }
      lazy val mem = Array.tabulate[Lazy[Int]](digits.length, 11, 11)(go)

      (for (
        lft <- 1 to 10;
        rgt <- 1 to 10
      ) yield go(digits.length, lft, rgt)()).min

    }
    val count = StdIn.readInt()
    val digits = StdIn.readLine().split(" ").map(_.toInt)


    println(
      time(
        count,
        digits.map(x =>
          if (x == 0) { 10 }
          else { x }
        )
      )
    )

  }
}
object BangaloreBank {}
