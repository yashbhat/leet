package org.codesignal.arcade.intro

object Q26 {
  def main(args: Array[String]): Unit = {}

  def solution(n: Int): Boolean = {
    n.toString.forall(_.toInt % 2 == 0)
  }

}
