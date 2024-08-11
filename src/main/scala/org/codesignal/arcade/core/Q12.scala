package org.codesignal.arcade.core

object Q12 {
  def main(args: Array[String]): Unit = {}

  def solution(a: Int, b: Int): Boolean = {
!(b==a || ((b > a) && (b-a)%2==0))
  }


}
