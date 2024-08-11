package org.codesignal.arcade.core

object Q123 {

  def main(args: Array[String]): Unit = {}

  def solution(cell: String): Int = {
    def reflect(x: Int): Int = if (x < 5) { x }
    else { 9 - x }
    (reflect(cell(0).toInt - 'a'.toInt + 1) ,
      reflect(cell.tail.toInt)) match {
      case (1, 1) => 2
      case (1, 2) => 3
      case (1, _) => 4
      case (2, 1) => 3
      case (2, 2) => 4
      case (2, _) => 6
      case (_, 1) => 4
      case (_, 2) => 6
      case _ => 8
    }
  }



}
