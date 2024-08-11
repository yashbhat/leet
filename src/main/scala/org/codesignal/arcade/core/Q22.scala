package org.codesignal.arcade.core

object Q22 {
  def main(args: Array[String]): Unit = {
    println(solution(13))
  }

  def solution(n: Int): Int = {
    return Integer.parseInt(n.toBinaryString.reverse.grouped(2).map(_ + "0").map(_.take(2)).toSeq.reverse.mkString(""), 2)

  }


}
