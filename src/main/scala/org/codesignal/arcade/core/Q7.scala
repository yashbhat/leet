package org.codesignal.arcade.core

object Q7 {
  def main(args: Array[String]): Unit = {

  }

  def solution(n: Int): Int = {
    ((n / 60).toString + (n % 60).toString).map(_.toString.toInt).sum
  }


}
