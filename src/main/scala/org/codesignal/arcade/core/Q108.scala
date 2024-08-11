package org.codesignal.arcade.core

object Q108 {

  def main(args: Array[String]): Unit = {}

  def solution(image: Array[Array[Int]]): Array[Array[Int]] = {

    def getAverage(i: Int, j: Int): Int = (for (
      a <- i to i + 2;
      b <- j to j + 2
    ) yield image(a)(b)).sum/9

    def boxBlur(image: Array[Array[Int]] = image): Seq[Seq[Int]] = {
      val rows = image.length
      val cols = image(0).length
      for (
        i <- (0 until rows - 2);
        x = (0 until cols - 2).map(j => getAverage(i, j))
      ) yield x
    }
    boxBlur().map(_.toArray).toArray
  }

}
