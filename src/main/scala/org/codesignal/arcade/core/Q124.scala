package org.codesignal.arcade.core

object Q124 {

  def main(args: Array[String]): Unit = {}
  def solution(bishop1: String, bishop2: String): Array[String] = {

    import scala.annotation.tailrec
    @tailrec
    def move(a: Char, b: Int, dir: (Int, Int)): String = {
      if (a == 'a' || a == 'h' || b == 1 || b == 8) {
        s"$a$b"
      } else move((a.toInt + dir._1).toChar, b + dir._2, dir)
    }

    (if ((bishop1(0).toInt - bishop2(0).toInt).abs == (bishop1.tail.toInt - bishop2.tail.toInt).abs) {
      (bishop1(0).toInt - bishop2(0).toInt, bishop1.tail.toInt - bishop2.tail.toInt) match {
        case (x, y) if x > 0 && y > 0 =>
          Array(move(bishop1(0), bishop1.tail.toInt, (1, 1)), move(bishop2(0), bishop2.tail.toInt, (-1, -1)))
        case (x, y) if x < 0 && y < 0 =>
          Array(move(bishop1(0), bishop1.tail.toInt, (-1, -1)), move(bishop2(0), bishop2.tail.toInt, (1, 1)))
        case (x, y) if x < 0 && y > 0 =>
          Array(move(bishop1(0), bishop1.tail.toInt, (-1, 1)), move(bishop2(0), bishop2.tail.toInt, (1, -1)))
        case (x, y) if x > 0 && y < 0 =>
          Array(move(bishop1(0), bishop1.tail.toInt, (1, -1)), move(bishop2(0), bishop2.tail.toInt, (-1, 1)))
      }

    } else {
      Array(bishop1, bishop2)
    }).sorted
  }

}
