package org.codesignal

class Q8 {
  def solution(matrix: Array[Array[Int]]): Int = {
    matrix.transpose.map(_.takeWhile(_ > 0).sum).sum
  }
}
