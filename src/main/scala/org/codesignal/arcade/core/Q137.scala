package org.codesignal.arcade.core



object Q137 {

  def main(args: Array[String]): Unit = {}

  def solution(x: Int, weekDay: String, month: String, yearNumber: Int): Int = {
    import java.time.LocalDate
    import java.time.Month

    val xWeekFirstDay = LocalDate
      .parse(s"$yearNumber-${("0" + Month.valueOf(month.toUpperCase).getValue).takeRight(2)}-01")
      .plusWeeks(x - 1)

    val desiredDay = Iterator
      .iterate(xWeekFirstDay)(x => x.plusDays(1))
      .dropWhile(_.getDayOfWeek.toString.toUpperCase != weekDay.toUpperCase)
      .next()
    if (desiredDay.getMonthValue == Month.valueOf(month.toUpperCase).getValue) {
      desiredDay.getDayOfMonth
    } else { -1 }
  }

}
