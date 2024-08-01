package org.codesignal.arcade.intro

object Q37 {
  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[Int], k: Int): Int = {

    inputArray.sliding(k).map(_.sum).max
    val (firstK, rest) = inputArray.splitAt(k)
    rest
      .foldLeft((firstK, firstK.sum, firstK.sum))((x, y) =>
        (x._1.tail :+ y, x._2 + y - x._1.head, x._3.max(x._2 + y - x._1.head))
      )
      ._3
  }

  def solution2(inputArray: Array[Int], k: Int): Int = {
    inputArray.sliding(k).map(_.sum).max
  }

}
