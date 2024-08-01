package org.codesignal.arcade.intro

object Q19 {
  def main(args: Array[String]): Unit = {}

  def solution(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean = {
    (yourLeft == friendsLeft && yourRight == friendsRight) || (yourRight == friendsLeft && yourLeft == friendsRight)
  }

}
