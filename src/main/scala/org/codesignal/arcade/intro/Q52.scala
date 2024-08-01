package org.codesignal.arcade.intro

object Q52 {
  def main(args: Array[String]): Unit = {}

  def solution(text: String): String = {

    val y = text
      .foldLeft(("", ""))((x, y) =>
        if (y.isLetter) (x._1 + y, x._2)
        else ("", if (x._1.length > x._2.length) x._1 else x._2)
      )
    if (y._1.length > y._2.length) y._1 else y._2
  }

}
