package org.codesignal.arcade.intro

object Q14 {
  def main(args: Array[String]): Unit = {}

  def solution(a: Array[Int]): Array[Int] = {
    val b  = a.indices.partition(_%2 == 0)
    Array(b._1, b._2).map(x => x.map(a).sum)
  }

}
