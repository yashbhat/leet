package org.codesignal.arcade.core

object Q28 {
  def main(args: Array[String]): Unit = {}
  def solution(commands: String): Int = {
    commands
      .foldLeft((0, 0, 0))((a, b) =>
        b match {
          case 'L' => ((a._1 + 1) % 4, (a._2 + 3) % 4, a._3 + ((a._1 + 1) % 4 == (a._2 + 3) % 4).compareTo(false))
          case 'R' => ((a._1 + 3) % 4, (a._2 + 1) % 4, a._3 + ((a._1 + 3) % 4 == (a._2 + 1) % 4).compareTo(false))
          case 'A' => ((a._1 + 2) % 4, (a._2 + 2) % 4, a._3 + (a._1 % 4 == a._2 % 4).compareTo(false))
        }
      )
      ._3
  }

}
