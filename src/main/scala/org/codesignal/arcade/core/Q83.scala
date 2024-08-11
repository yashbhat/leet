package org.codesignal.arcade.core

object Q83 {

  def main(args: Array[String]): Unit = {}

  def solution(message: String): String = {

    def unencrypt(c: Char, s: String): String =
      s.appended(
        (((((c.toInt - 'a'.toInt) - (s.map(c => c.toInt - 'a'.toInt).sum) % 26) + 26) % 26) + 'a'.toInt).toChar
      )

    message.foldLeft("")({ case (x, y) =>
      unencrypt(y, x)
    })
  }

}
