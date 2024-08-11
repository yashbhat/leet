package org.codesignal.arcade.core

object Q56 {

  def main(args: Array[String]): Unit = {
  }

  def solution(startTag: String): String = {
s"</${startTag.tail.takeWhile(x => x!= ' ' && x!='>')}>"
  }



}
