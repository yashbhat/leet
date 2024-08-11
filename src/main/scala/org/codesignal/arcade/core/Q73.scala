package org.codesignal.arcade.core

object Q73 {

  def main(args: Array[String]): Unit = {
    println(solution(Array(1, 1, 1, 1, 1)).mkString("Array(", ", ", ")"))
  }

  def solution(a: Array[Int]): Array[Int] = {
    a.scanRight(0)((x, y) => x + y).dropRight(1).zip(a).map(x => (x._1 + x._2)%2)
  }



}
