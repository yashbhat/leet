package org.codesignal.arcade.core

object Q29 {
  def main(args: Array[String]): Unit = {}

  def solution(param1: Int, param2: Int): Int = {
    val s1 = param1.toString
    val s2 = param2.toString
    val maxL = s1.length.max(s2.length)
    ("0" * maxL + s1)
      .takeRight(maxL)
      .zip(("0" * maxL + s2).takeRight(maxL))
      .map({ case (c, c1) =>
        (c.toString.toInt + c1.toString.toInt) % 10
      })
      .map(_.toString)
      .mkString("")
      .toInt
  }

}
