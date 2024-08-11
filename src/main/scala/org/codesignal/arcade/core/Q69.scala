package org.codesignal.arcade.core

object Q69 {

  def main(args: Array[String]): Unit = {}

  def solution(legs: Int): Array[Int] = {
    ((legs - (legs / 4) * 4) / 2).to(legs / 2, 2).toArray
  }

}
