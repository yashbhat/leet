package org.codesignal.arcade.core

object Q92 {

  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[String], result: String): Int = {
    def isCrossOver(input: Array[String]): Boolean = {
      val zip = input(0).zip(input(1))
      (for (
        x <- result.indices;
        y = (zip(x), result(x))
      ) yield y).forall(x => x._2 == x._1._1 || x._2 == x._1._2)
    }

    def combinations(input: Array[String] = inputArray): Seq[Array[String]] = {
      for (
        x <- 0 until input.length - 1;
        y <- x + 1 until input.length;
        z = Array(input(x), input(y))
      ) yield z
    }
    combinations().count(isCrossOver)
  }

}
