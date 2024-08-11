package org.codesignal.arcade.core

object Q104 {

  def main(args: Array[String]): Unit = {}

  def solution(formation: Array[Array[String]], k: Int): Array[Array[String]] = {
    val circle = Seq((1,2), (3,2), (2,1), (3,0), (1,0), (0,1))

    def tabulate(i: Int, i1: Int): String = {
      if (circle.contains((i, i1))) { val x = circle((circle.indexOf((i, i1)) + k) % 6); formation(x._1)(x._2) }
      else { formation(i)(i1) }
    }
    Array.tabulate(formation.length, formation.head.length)(tabulate)
  }

}
