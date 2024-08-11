package org.codesignal.arcade.core

object Q110 {

  def main(args: Array[String]): Unit = {}
  def solution(matrix: Array[Array[Boolean]]): Int = {

    matrix.map(_.count(_ == true)).sum * 4 - (for (
      x <- matrix.indices;
      y <- 0 until matrix.head.length - 1;
      z = 2 if matrix(x)(y) && matrix(x)(y + 1)
    ) yield z).sum - (for (
      x <- 0 until matrix.length - 1;
      y <- matrix.head.indices;
      z = 2 if matrix(x)(y) && matrix(x + 1)(y)
    ) yield z).sum
  }

}
