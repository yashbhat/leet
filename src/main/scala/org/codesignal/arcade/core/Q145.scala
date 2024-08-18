package org.codesignal.arcade.core

object Q145 {

  def main(args: Array[String]): Unit = {
  }

  def solution(letter: String): Int = {
    val pattern = "(?i)([a-zA-Z]+)([^a-zA-Z]+)\\1([^a-zA-Z]+|$)".r
    return pattern.findAllIn(letter).length
  }



}
