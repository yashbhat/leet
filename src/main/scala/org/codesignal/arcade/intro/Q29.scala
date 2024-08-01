package org.codesignal.arcade.intro

object Q29 {
  def main(args: Array[String]): Unit = {}

  def solution(cell1: String, cell2: String): Boolean = {
    (cell1(0).toInt - cell2(0).toInt + cell1.tail.toInt - cell2.tail.toInt)%2 == 0
  }



}
