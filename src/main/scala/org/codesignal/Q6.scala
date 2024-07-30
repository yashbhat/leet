package org.codesignal

class Q6 {
  def solution(statues: Array[Int]): Int = {
    statues.max - statues.min - statues.size + 1
  }



}
