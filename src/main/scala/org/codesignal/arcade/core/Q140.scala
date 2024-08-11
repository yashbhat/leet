package org.codesignal.arcade.core

object Q140 {

  def main(args: Array[String]): Unit = {
  }


  def solution(s: String): String  = {
    val pattern = "([a-zA-Z]+) ([a-zA-Z]+)".r
    val sub = "$2 $1"
    return pattern.replaceAllIn(s, sub)
  }



}
