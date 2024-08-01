package org.codesignal.arcade.intro

object Q51 {
  def main(args: Array[String]): Unit = {}

  def solution(n: Int): Int = {
    val s = n.toString;
    (for (
      x <- s.indices;
      y = s.take(x) + s.drop(x + 1)
    ) yield y.toInt).max
  }

}
