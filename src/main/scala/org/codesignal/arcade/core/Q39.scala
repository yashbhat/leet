package org.codesignal.arcade.core

object Q39 {
  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[Int], l: Int, r: Int): Array[Int] = {
    inputArray.take(l).appendedAll(inputArray.drop(r + 1))
  }



}
