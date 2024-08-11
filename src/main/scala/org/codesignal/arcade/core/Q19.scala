package org.codesignal.arcade.core

object Q19 {
  def main(args: Array[String]): Unit = {}

  def solution(a: Int, b: Int): Int = {
    (a to b).map(_.toBinaryString.count(_=='1')).sum
  }


}
