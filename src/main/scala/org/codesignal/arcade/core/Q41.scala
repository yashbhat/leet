package org.codesignal.arcade.core

object Q41 {
  def main(args: Array[String]): Unit = {}

  def solution(arr: Array[Int]): Array[Int] = {
    val l = arr.length
    if (l % 2 == 0) {
      arr.take(l / 2 - 1).appended(arr(l / 2) + arr(l / 2 - 1)).appendedAll(arr.drop(l / 2 + 1))
    } else arr
  }

}
