package org.codesignal.arcade.intro

class Q9 {
  def solution(inputArray: Array[String]): Array[String] = {
    inputArray.filter(_.length ==inputArray.map(_.length).max)
  }
}
