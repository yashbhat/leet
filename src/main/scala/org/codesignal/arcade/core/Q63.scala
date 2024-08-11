package org.codesignal.arcade.core

object Q63 {

  def main(args: Array[String]): Unit = {}

  def solution(a: Array[Int]): Int = {
    a.map(x => (x - 1) / 10000).distinct.length + a.length
  }

}
