package org.codesignal.arcade.core

object Q81 {

  def main(args: Array[String]): Unit = {}

  def solution(inputString: String): String = {
    def refl(a: Char): Char = {
      ('a'.toInt + 'z'.toInt - a.toInt).toChar
    }
    inputString.map(refl)
  }


}
