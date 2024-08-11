package org.codesignal.arcade.core

object Q43 {
  def main(args: Array[String]): Unit = {}
  def solution(n: Int): Boolean = {
    Seq((1 to 20).map(x => x * x),
      (2 to 7).map(x => x * x * x),
      (2 to 3).map(x => x * x * x * x * x)).exists(_.contains(n))
  }



}
