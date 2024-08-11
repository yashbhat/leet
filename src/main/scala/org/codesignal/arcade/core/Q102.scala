package org.codesignal.arcade.core

object Q102 {

  def main(args: Array[String]): Unit = {}

  def solution(matrix: Array[Array[Int]], a: Int, b: Int): Int = {
    matrix(a).sum + matrix.transpose.apply(b).sum - matrix(a)(b)
  }


}
