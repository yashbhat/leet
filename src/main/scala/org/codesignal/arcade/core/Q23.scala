package org.codesignal.arcade.core

object Q23 {
  def main(args: Array[String]): Unit = {
  }

  def solution(n: Int, m: Int): Int = {
    return math.pow(2,(n^m).toBinaryString.reverse.zipWithIndex.dropWhile(_._1=='0').head._2).toInt

  }


}
