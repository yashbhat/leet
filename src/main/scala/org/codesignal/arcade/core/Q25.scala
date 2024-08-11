package org.codesignal.arcade.core

object Q25 {
  def main(args: Array[String]): Unit = {
  }

  def solution(n: Int): Int = {

    n match {
      case 1 => 1
      case 2 => 2
      case x if x <=6 => 6
      case x if x <=24 => 24
      case _ => 120

    }
  }



}
