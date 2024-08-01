package org.codesignal.arcade.intro

object Q55 {
  def main(args: Array[String]): Unit = {}

  def solution(matrix: Array[Array[Int]]): Int = {
    (for (
      i <- 0 until matrix.length - 1;
      j <- 0 until matrix.head.length - 1
    ) yield Seq(matrix(i)(j), matrix(i + 1)(j), matrix(i)(j + 1), matrix(i + 1)(j + 1))).distinct.length
  }

}
