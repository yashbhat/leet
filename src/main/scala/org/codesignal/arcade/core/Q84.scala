package org.codesignal.arcade.core

object Q84 {

  def main(args: Array[String]): Unit = {}

  def solution(note: String): String = {
    def unencrypt(c: Char): Char = {
      if (c.isDigit) {
        ('a'.toInt + c.toString.toInt).toChar
      } else if (c.toInt - 'a'.toInt < 10 && c.toInt - 'a'.toInt >= 0) {
        ((c.toInt - 'a'.toInt) + '0'.toInt).toChar
      } else { c }
    }
    note.map(unencrypt)
  }

}
