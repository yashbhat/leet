package org.codesignal.arcade.intro

object Q27 {
  def main(args: Array[String]): Unit = {}

  def solution(name: String): Boolean = {
    (name.head.isLetter || name.head == '_') && name.forall(c => c.isLetterOrDigit || c == '_')
  }


}
