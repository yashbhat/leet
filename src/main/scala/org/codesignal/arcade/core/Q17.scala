package org.codesignal.arcade.core

object Q17 {
  def main(args: Array[String]): Unit = {}

  def solution(n: Int, k: Int): Int = {
    return n & (Integer.parseInt("1"*n.toBinaryString.length, 2) - math.pow(2, (k - 1)).toInt)
  }



}
