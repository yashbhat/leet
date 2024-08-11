package org.codesignal.arcade.core

object Q93 {

  def main(args: Array[String]): Unit = {}

  def solution(s: String): Int = {
    (1 to s.length).filter(l =>( s.take(l)* ((s.length/l)+1)).contains(s)).min
  }

}
