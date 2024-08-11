package org.codesignal.arcade.core

object Q80 {

  def main(args: Array[String]): Unit = {}
  def solution(symbol: Char): String = {
    if (symbol.isDigit) {
      if (symbol.toInt % 2 == 0) {
        "even"
      } else {
        "odd"
      }
    } else {
      "not a digit"
    }
  }

}
