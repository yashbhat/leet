package org.codesignal.arcade.core

object Q21 {
  def main(args: Array[String]): Unit = {}

  def solution(n: Int): Int = {
    return math.pow(2, n.toBinaryString.reverse.zipWithIndex.filter(_._1 == '0')(1)._2).toInt
  }

}
