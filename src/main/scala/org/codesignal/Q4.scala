package org.codesignal

class Q4 {
  def solution(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(x => x(0) * x(1)).max
  }


}
