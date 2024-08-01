package org.codesignal.arcade.intro

object Q39 {
  def main(args: Array[String]): Unit = {}

  def solution(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int = {
    if (weight1 + weight2 <= maxW) {
      value1 + value2
    } else if (weight1.min(weight2) > maxW) { 0 }
    else if (weight1.max(weight2) <= maxW) {
      value1.max(value2)
    } else if(weight1< weight2)
    {
      value1
    }else{value2}
  }

}
