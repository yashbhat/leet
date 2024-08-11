package org.codesignal.arcade.core

object Q82 {

  def main(args: Array[String]): Unit = {}

  def solution(number: Char): Array[String] = {
    (for (
      y <- 0 to (number.toInt - 'A'.toInt) / 2;
      pair = s"${('A'.toInt + y).toChar} + ${(number.toInt - y).toChar}"
    ) yield pair).toArray
  }

}
