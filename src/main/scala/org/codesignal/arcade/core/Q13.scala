package org.codesignal.arcade.core

object Q13 {
  def main(args: Array[String]): Unit = {}

  def solution(a: Int, b: Int, c: Int): Boolean = {
    (a+b==c||a-b==c||a*b==c||(a/b==c && a%b==0))
  }


}
