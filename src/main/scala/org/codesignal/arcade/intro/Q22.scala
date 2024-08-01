package org.codesignal.arcade.intro

object Q22 {
  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[Int]): Int = {
    (1 to 1001).filterNot(x => inputArray.exists(_ %x == 0)).head
  }

}
