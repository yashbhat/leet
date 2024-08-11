package org.codesignal.arcade.core

object Q132 {

  def main(args: Array[String]): Unit = {}

  def solution(birthdayDate: String): Int = {
    val split = birthdayDate.split('-')
    val month = split(0).toInt
    val day = split(1).toInt
    val year = split(2).toInt

    def isLeap(year: Int): Boolean = {
      year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)
    }

    (day, month) match {
      case (29, 2) =>
        Iterator
          .iterate((6, year))(x =>
            if (isLeap(x._2)) { ((x._1 + 2) % 7, x._2 + 1) }
            else { ((x._1 + 1) % 7, x._2 + 1) }
          )
          .drop(1)
          .dropWhile(x => !(x._1 == 6 && isLeap(x._2)))
          .next()
          ._2 - year
      case (_, x) if x <= 2 =>
        Iterator
          .iterate((0, year))(x =>
            if (isLeap(x._2)) { ((x._1 + 2) % 7, x._2 + 1) }
            else { ((x._1 + 1) % 7, x._2 + 1) }
          )
          .drop(1)
          .dropWhile(_._1 != 0)
          .next()
          ._2 - year
      case _ =>
        Iterator
          .iterate((0, year))(x =>
            if (isLeap(x._2 + 1)) { ((x._1 + 2) % 7, x._2 + 1) }
            else { ((x._1 + 1) % 7, x._2 + 1) }
          )
          .drop(1)
          .dropWhile(_._1 != 0)
          .next()
          ._2 - year
    }
  }

}
