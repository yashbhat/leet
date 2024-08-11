package org.codesignal.arcade.core

object Q62 {

  def main(args: Array[String]): Unit = {}
  def solution(s: String): Int = {
    def canMake(str: String, i: Int): Boolean = {
      str.groupBy(identity).view.mapValues(_.length).values.toSeq.sorted == i.toString
        .groupBy(identity)
        .view
        .mapValues(_.length)
        .values
        .toSeq
        .sorted
    }

    def makePS(str: String): Int = {
      Math
        .sqrt(("1" + "0" * str.length).toInt)
        .toInt
        .to(1, -1)
        .dropWhile(x => !canMake(s, x * x))
        .headOption
        .map(x => x * x)
        .getOrElse(-1)
    }

    s.length match {
      case 1                                                 => 9
      case 2 if s(0) != s(1)                                 => 81
      case 2                                                 => -1
      case 3 if s(0) != s(1) && s(2) != s(1) && s(0) != s(2) => 961
      case 3 if s(0) == s(1) && s(2) == s(1)                 => -1
      case 3                                                 => 900
      case _                                                 => makePS(s)

    }
  }

}
