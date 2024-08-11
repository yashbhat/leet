package org.codesignal.arcade.core

object Q57 {

  def main(args: Array[String]): Unit = {
  }

  def solution(inputString: String): Boolean = {
    def isHex(c: Char): Boolean = { c.isDigit || "ABCDEF".contains(c) }
    def isLegit(s: String): Boolean = { s.length == 2 && s.forall(isHex) }
    val groups = inputString.split('-')
    inputString.count(_ == '-') == 5 && groups.length == 6 && groups.forall(isLegit)

  }



}
