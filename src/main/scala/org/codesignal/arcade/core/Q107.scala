package org.codesignal.arcade.core

object Q107 {

  def main(args: Array[String]): Unit = {}
  def solution(matrix: Array[Array[Boolean]]): Array[Array[Int]] = {
    def getNeighbours(i: Int, j: Int): Int = (for (
      x <- i - 1 to i + 1;
      y <- j - 1 to j + 1
    ) yield scala.util.Try(matrix(x)(y)).getOrElse(false)).count(_ == true) - Seq(matrix(i)(j)).count(_ == true)
    (for (
      i <- matrix.indices;
      x = matrix.head.indices.map(j => getNeighbours(i, j)).toArray
    ) yield x).toArray
  }

}
