package org.codesignal.arcade.intro

object Q43 {
  def main(args: Array[String]): Unit = {}

  def solution(inputString: String): Boolean = {
    val a = inputString.groupBy(identity).view.mapValues(_.length)

    ('a'.toInt to 'z'.toInt).map(c => a.getOrElse(c.toChar, 0)).sliding(2).forall(s => s(0)>=s(1))
  }



}
