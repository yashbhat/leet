package org.codesignal.arcade.core

object Q24 {
  def main(args: Array[String]): Unit = {
    println(solution(3,4))
  }

  def solution(n: Int, m: Int): Int = {
    return math.pow(2, ("0"+ (n^m).toBinaryString).reverse.zipWithIndex.dropWhile(_._1=='1').head._2).toInt

  }


}
