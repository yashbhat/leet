package org.codesignal.arcade.intro

object Q20 {
  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[Int]): Int = {
inputArray.sliding(2).map(x => (x(1) - x(0)).abs).max
  }


}
