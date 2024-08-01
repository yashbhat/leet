package org.codesignal.arcade.intro

class Q6 {
  def solution(statues: Array[Int]): Int = {
    statues.max - statues.min - statues.length + 1
  }



}
