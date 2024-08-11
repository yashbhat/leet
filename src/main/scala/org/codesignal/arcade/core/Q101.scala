package org.codesignal.arcade.core

object Q101 {

  def main(args: Array[String]): Unit = {}

  def solution(matrix: Array[Array[Int]]): Array[Array[Int]] = {

    def tabulate(i: Int, i1: Int): Int = {
      if (i == i1) {
        matrix(i)(matrix.length - 1 - i)
      } else if (i + i1 == matrix.length - 1) {
        matrix(i)(matrix.length - 1 - i)
      }
      else {
        matrix(i)(i1)
      }
    }

    Array.tabulate(matrix.length, matrix.length)(tabulate)
  }

}
