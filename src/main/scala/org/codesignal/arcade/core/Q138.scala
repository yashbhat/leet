package org.codesignal.arcade.core

object Q138 {

  def main(args: Array[String]): Unit = {
    println(solution("!this sentence is TOTALLY incorrecT"))
  }

  def solution(sentence: String): Boolean = {
    val pattern = "^[A-Z][^.?!]*[.?!]$"
    return sentence.matches(pattern)
  }


}
