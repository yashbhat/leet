package org.codesignal.arcade.core

object Q131 {

  def main(args: Array[String]): Unit = {}

  def solution(part: String, total: String): Array[Int] = {
    import scala.annotation.tailrec
    @tailrec
    def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a % b)
    }
    def mod(x: Int): Int = if (x > 0) { x }
    else { 0 - x }

    def divide(q: Int, d: Int): (Int, Int) = {
      if (q < 0 || d < 0) {(-1, 1) }
      else if (d == 0) { (-1, 1) }
      else {
        val g = gcd(mod(q), mod(d))
        (mod(q) / g, mod(d) / g)
      }
    }

    def convert(s: String): Int = {
      val time = s.split(':').map(_.toInt)
      time(2) + 60 * (time(1) + 60 * time(0))
    }

    val div = divide(convert(part), convert(total))
    Array(div._1, div._2)
  }

}
