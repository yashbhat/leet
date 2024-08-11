package org.codesignal.arcade.core

object Q42 {
  def main(args: Array[String]): Unit = {}

  def solution(statues: Array[Int]): Int = {
    statues.max - statues.min - statues.length + 1
  }


}
