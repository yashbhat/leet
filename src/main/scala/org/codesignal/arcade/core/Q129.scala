package org.codesignal.arcade.core

object Q129 {

  def main(args: Array[String]): Unit = {}

  def solution(white: String, black: String, toMove: Char): String = {

    if (white.head == black.head) {
      if (white.tail.toInt < black.tail.toInt) {
        "draw"
      } else if (white.tail.toInt == 9 - black.tail.toInt) {
        toMove match {
          case 'w' => "white"
          case 'b' => "black"
        }
      } else {
        if (white.tail.toInt > 9 - black.tail.toInt) {
          "white"
        } else {
          "black"
        }
      }
    } else if ((white.head.toInt - black.head.toInt).abs > 1) {
      if (
        white.tail.toInt == 9 - black.tail.toInt || (white.tail.toInt == 2 && black.tail.toInt == 6) || (white.tail.toInt == 3 && black.tail.toInt == 7)
      ) {
        toMove match {
          case 'w' => "white"
          case 'b' => "black"
        }
      } else {
        if (white.tail.toInt > 9 - black.tail.toInt) {
          "white"
        } else {
          "black"
        }
      }
    } else {
      (white.tail.toInt, black.tail.toInt, toMove) match {
        case (2, b, 'w') if Seq(3, 5, 6).contains(b)  => "white"
        case (2, b, 'w')                              => "black"
        case (2, b, 'b') if Seq(2, 3, 5).contains(b)  => "black"
        case (2, b, 'b')                              => "white"
        case (w, 7, 'b') if Seq(6, 4, 3).contains(w)  => "black"
        case (w, 7, 'b')                              => "white"
        case (w, 7, 'w') if Seq(7, 6, 4).contains(w)  => "white"
        case (w, 7, 'w')                              => "black"
        case (w, b, 'w') if b > w && (b - w) % 2 == 0 => "black"
        case (w, b, 'b') if b > w && (b - w) % 2 == 0 => "white"
        case (w, b, 'w') if b > w                     => "white"
        case (w, b, 'b') if b > w                     => "black"
        case (w, b, 'b') if b == 9 - w                => "black"
        case (w, b, 'w') if b == 9 - w                => "white"
        case (w, b, m) if w > 9 - b                   => "white"
        case (w, b, m)                                => "black"

      }
    }
  }

}
