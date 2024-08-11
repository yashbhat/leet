package org.codesignal.arcade.core

object Q119 {

  def main(args: Array[String]): Unit = {}

  def solution(matrix: Array[Array[Int]]): Boolean = {
    if (matrix.length == 1) { true }
    else {
      matrix.sortBy(_.head).transpose.forall(_.sliding(2).forall(x => x(0) < x(1)))
    }
  }

}
