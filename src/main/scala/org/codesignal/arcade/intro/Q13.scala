package org.codesignal.arcade.intro

object Q13 {
  def main(args: Array[String]): Unit = {}

  def solution(inputString: String): String = {
    inputString
      .foldLeft(Seq(""))((x, y) =>
        y match {
          case '(' => x.appended("")
          case ')' => x.updated(x.length - 2, x(x.length - 2) + x.last.reverse).dropRight(1)
          case _   => x.updated(x.length - 1, x.last :+ y)
        }
      )
      .head

  }

}
