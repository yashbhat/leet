package org.codesignal.arcade.core

object Q46 {

  def main(args: Array[String]): Unit = {
    println(solution(21, 5))
  }
  def solution(current: Int, numberOfDigits: Int): Int = {

    Iterator.iterate((current, numberOfDigits - current.toString.length))({ case (i, i1) =>
      (i + 1, i1 - (i + 1).toString.length)
    }).takeWhile(_._2>=0).toSeq.last._1
  }

}
