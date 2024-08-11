package org.codesignal.arcade.core

object Q120 {

  def main(args: Array[String]): Unit = {}

  def solution(a: Array[Int]): Array[Int] = {
    def elDiff(i: Int): Int = {
      val x = i.toString.toCharArray.map(_.toString.toInt)
      x.max - x.min
    }

    val x = a.groupBy(elDiff).view.mapValues(_.reverse)

    x.keys.toArray.sorted.flatMap(x)
  }


}
