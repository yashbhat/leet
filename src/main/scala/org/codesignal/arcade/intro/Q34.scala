package org.codesignal.arcade.intro

object Q34 {
  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[Int], k: Int): Array[Int] = {
    (for (
      x <- inputArray.indices;
      y = inputArray(x) if (x +1)%k ==0
    ) yield y).toArray
  }

}
