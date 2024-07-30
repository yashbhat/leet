package org.hackerank.algorithms.dynamic.SherlockCost

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'cost' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY B as parameter.
   */

  class Lazy[T](expr: => T) {
    lazy val value = expr

    def apply(): T = value
  }

  object Lazy {
    def apply[T](expr: => T) = new Lazy[T](expr)
  }


  def cost(B: Array[Int]): Int = {
    // Write your code here
    def go(i: Int): Lazy[Int] = Lazy {
      i
    }

    lazy val mem = Array.tabulate[Lazy[Int]](B.length)(go)
    //    go(B.length)()
    val pair = B.sliding(2).foldLeft((0, 0))((x, y) => (x._1.max(x._2 + y(0) - 1), (x._1 + y(1) - 1).max(x._2 + (y(1) - y(0)).abs)))

    pair._1.max(pair._2)
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = StdIn.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = StdIn.readLine.trim.toInt

      val B = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
      val result = Result.cost(B)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

object SherlockCost {

}
