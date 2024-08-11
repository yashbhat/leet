package org.codesignal.arcade.core

object Q27 {
  def main(args: Array[String]): Unit = {
  }

  def solution(a: Int, b: Int, n: Int): Int = {
    (0 until n).foldLeft((0, a, b))((x,y) => (x._1 + x._2*x._3, x._2+1, x._3+1))._1
  }

}
