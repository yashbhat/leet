package org.codesignal.arcade.core

object Q37 {
  def main(args: Array[String]): Unit = {}

  def solution(arr: Array[Int]): Array[Int] = {
    if (arr.length > 1) {
      arr.updated(0, arr.last).updated(arr.length - 1, arr.head)
    } else { arr }
  }

}
