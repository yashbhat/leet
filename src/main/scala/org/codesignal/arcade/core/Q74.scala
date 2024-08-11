package org.codesignal.arcade.core

object Q74 {

  def main(args: Array[String]): Unit = {
    println(solution(4, "The Fox asked the stork, 'How is the soup?'"))
  }

  def solution(maxLength: Int, text: String): Int = {
    text.split("[^a-zA-Z0-9]+").count(_.length<= maxLength)
  }



}
