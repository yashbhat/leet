package org.codesignal

object Q17 {
  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[Int]): Int = {
    inputArray.tail
      .foldLeft((0, inputArray.head))((acc, x) =>
        if (x > acc._2) {
          (acc._1, x)
        } else {
          (acc._1 + acc._2 + 1 - x, acc._2 + 1)
        }
      )
      ._1
  }

}
