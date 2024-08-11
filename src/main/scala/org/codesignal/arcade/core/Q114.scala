package org.codesignal.arcade.core

object Q114 {

  def main(args: Array[String]): Unit = {}

  def solution(shuffled: Array[Int]): Array[Int] = {
    val sum = shuffled.sum / 2

    val index = shuffled.indexOf(sum)
    (shuffled.take(index) appendedAll shuffled.drop(index + 1)).sorted
  }


}
