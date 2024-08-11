package org.codesignal.arcade.core

object Q34 {
  def main(args: Array[String]): Unit = {}

  def solution(n: Int, m: Int): Int = {
    import scala.annotation.tailrec
    @tailrec
    def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a % b)
    }
    def count(w: Int, h: Int): Int = (w, h) match {
      case (_, 1) => w
      case _ =>
        (1 to h).foldLeft(0.0)((x, y) => x + ((w.toDouble / h) * y).ceil - ((w.toDouble / h) * (y - 1)).floor).toInt
    }

    val h = n.min(m)
    val w = n.max(m)
    val g = gcd(w, h)

    count(w / g, h / g) * g + 2 * (g - 1)

  }

}
