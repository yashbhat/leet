package org.codesignal.arcade.core

object Q30 {
  def main(args: Array[String]): Unit = {}
  def solution(k: Int): Int = {
    val a = (1 to k).map(a => a * a).partition(_ % 2 == 0)
    a._1.sum - a._2.sum
  }

}
