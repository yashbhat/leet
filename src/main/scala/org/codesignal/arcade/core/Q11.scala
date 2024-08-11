package org.codesignal.arcade.core

object Q11 {
  def main(args: Array[String]): Unit = {}

  def solution(a: Int, b: Int, c: Int): Int = {
    (a, b, c) match {
      case (i, j, k) if j == k => a
      case (i, j, k) if j == i => c
      case _                   => b
    }
  }

}
