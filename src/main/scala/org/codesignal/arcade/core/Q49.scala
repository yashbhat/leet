package org.codesignal.arcade.core

object Q49 {

  def main(args: Array[String]): Unit = { println(solution(6, 4)) }
  /*
  y = b*sqrt(2)+ x
  y = a*sqrt(2) -x


   */
  def solution(a: Int, b: Int): Int = {
    val i = math.sqrt(2) * a / 2
    val j = math.sqrt(2) * b / 2
    val max = i.max(j)
    val min = i.min(j)
    val maxCeil = max.ceil.toInt

    val c =
      (
        for (
          x <- (-1 * maxCeil) to maxCeil;
          y <- 1 to maxCeil;
          coords = (x, y) if y < (x + i) && y < j - x && y > x - i && y > -x - j
        ) yield coords
      )
    c.size * 2 + 1 + 2 * min.floor.toInt

  }

}
