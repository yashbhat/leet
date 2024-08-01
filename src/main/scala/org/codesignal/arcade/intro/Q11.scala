package org.codesignal.arcade.intro

object Q11 {
  def main(args: Array[String]): Unit = {
  }
  def solution(n: Int): Boolean = {
    val intSeq = n.toString.map(_.toInt)
    val split = intSeq.splitAt(intSeq.size/2)
    split._1.sum == split._2.sum
  }


}
