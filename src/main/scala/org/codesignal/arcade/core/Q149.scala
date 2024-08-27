package org.codesignal.arcade.core

object Q149 {

  def main(args: Array[String]): Unit = {
    println(solution("rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR"))
  }
  def solution(notation: String): String = {
    val board = notation
      .split('/')
      .map(s =>
        s.foldLeft("")({
          case (x, y) if y.isDigit => x + " " * y.toString.toInt
          case (x, y)              => x.appended(y)
        }).toCharArray
      )
    (for (
      x <- 0 to 7;
      row = (for (y <- 7.to(0, -1)) yield board(y)(x))
    ) yield row)
      .map(_.foldLeft(("", 0))({
        case ((x, y), ' ') => (x, y + 1)
        case ((x, 0), z)   => (x.appended(z), 0)
        case ((x, y), z)   => (x.appended(y.toString.head).appended(z), 0)
      }))
      .map({
        case (x, 0) => x
        case (x, y) => x.appended(y.toString.head)
      })
      .mkString("/")

  }

}
