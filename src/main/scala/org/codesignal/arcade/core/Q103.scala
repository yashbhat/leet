package org.codesignal.arcade.core

object Q103 {

  def main(args: Array[String]): Unit = {}

  def solution(canvas: Array[Array[Char]], rectangle: Array[Int]): Array[Array[Char]] = {

    val x = rectangle

    def paint(a: Int, b: Int): Char = {
      if ((a == x(1) || a == x(3)) && (b == x(0) || b == x(2))) { '*' }
      else if ((a == x(1) || a == x(3)) && (b > x(0) && b < x(2))) { '-' }
      else if ((a > x(1) && a < x(3)) && (b == x(0) || b == x(2))) { '|' }
      else { canvas(a)(b) }
    }
    Array.tabulate(canvas.length, canvas.head.length)(paint)
  }

}
