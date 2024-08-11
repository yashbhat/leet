package org.codesignal.arcade.core

object Q31 {
  def main(args: Array[String]): Unit = {}

  def solution(n: Int): Boolean = {
        n.toString.reverse.dropWhile(_=='0').contains('0')
  }


}
