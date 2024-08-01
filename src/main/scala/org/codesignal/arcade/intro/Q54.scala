package org.codesignal.arcade.intro

object Q54 {
  def main(args: Array[String]): Unit = {}

  def solution(inputString: String): Int = {
    val temp = inputString
      .foldLeft(("", Seq(0)))((x, y) =>
        if (y.isDigit) (x._1 + y, x._2)
        else if (x._1.isEmpty) x
        else ("", x._2.appended(x._1.toInt))
      );
    (if (temp._1.isEmpty) 0 else temp._1.toInt) +
      temp._2.sum
  }

}
