package org.codesignal.arcade.core

object Q40 {
  def main(args: Array[String]): Unit = {}

  def solution(arr: Array[Int]): Boolean = {
    val l = arr.length
    (arr.head == arr.last) && (arr.head == (if (l % 2 == 0) arr(l / 2) + arr(l / 2 - 1) else arr(l / 2)))
  }



}
