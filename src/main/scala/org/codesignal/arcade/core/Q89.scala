package org.codesignal.arcade.core

object Q89 {

  def main(args: Array[String]): Unit = {}
  def solution(items: Array[Int]): Array[Int] = {
    items
      .foldLeft((Array[Int](), Array[Int]()))({ case (x, y) =>
        (x._1.appended(x._2.findLast(_ < y).getOrElse(-1)), x._2.appended(y))
      })
      ._1
  }

}
