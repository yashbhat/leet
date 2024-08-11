package org.codesignal.arcade.core

object Q136 {

  def main(args: Array[String]): Unit = {
    println(solution(2015, Array(2, 3), Array("11-04", "02-22", "02-23", "03-07", "03-08", "05-09")))
  }

  def solution(year: Int, daysOfTheWeek: Array[Int], holidays: Array[String]): Int = {
    import java.time.LocalDate

    holidays
      .map(_.split('-'))
      .map(x =>
        if (x(0).toInt > 8) { s"$year-${x(0)}-${x(1)}" }
        else { s"${year + 1}-${x(0)}-${x(1)}" }
      )
      .map(LocalDate.parse)
      .count(x => daysOfTheWeek.contains(x.getDayOfWeek.getValue))
  }

}
