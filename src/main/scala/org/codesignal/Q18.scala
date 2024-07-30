package org.codesignal

object Q18 {
  def main(args: Array[String]): Unit = {}

  def solution(inputString: String): Boolean = {
inputString.groupBy(identity).view.mapValues(_.length).count(_._2 % 2 != 0) <= 1
  }


}
