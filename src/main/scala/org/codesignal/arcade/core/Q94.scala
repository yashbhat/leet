package org.codesignal.arcade.core

object Q94 {

  def main(args: Array[String]): Unit = {}

  def solution(inputString: String, l: Int, r: Int): Boolean = {
    def isBeautiful(width: Int): Boolean = {
      if (width == inputString.length) {
        true
      } else {
        inputString.length % (width + 1) == width && (1 to inputString.length / (width + 1)).forall(x =>
          inputString(x * (width + 1) - 1).isWhitespace
        )
      }
    }

    (l to r).exists(isBeautiful)
  }

}
