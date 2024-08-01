package org.codesignal.arcade.intro

object Q30 {
  def main(args: Array[String]): Unit = {}

  def solution(n: Int, firstNumber: Int): Int = {
    if (firstNumber < n / 2) {
      firstNumber + n / 2
    } else { firstNumber - n / 2 }
  }

}
