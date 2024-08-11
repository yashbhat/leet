package org.codesignal.arcade.core

object Q76 {

  def main(args: Array[String]): Unit = {
  }

  def solution(number: Int, width: Int): String = {
    ("0"* width + number.toString).takeRight(width)
  }


}
