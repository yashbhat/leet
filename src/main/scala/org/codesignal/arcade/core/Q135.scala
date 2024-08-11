package org.codesignal.arcade.core

object Q135 {

  def main(args: Array[String]): Unit = {}

  def solution(currMonth: String): String = {
    import java.time.LocalDate
    import java.time.DayOfWeek

    val split = currMonth.split('-')

    val x = Iterator
      .iterate(LocalDate.parse(s"${split(1)}-${split(0)}-01"))(x => x.plusMonths(1))
      .drop(1)
      .dropWhile(_.getDayOfWeek != DayOfWeek.MONDAY)
      .next()
    s"${("0" + x.getMonthValue).takeRight(2)}-${x.getYear}"
  }

}
