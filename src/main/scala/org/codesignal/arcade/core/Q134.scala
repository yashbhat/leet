package org.codesignal.arcade.core

object Q134 {

  def main(args: Array[String]): Unit = {
    println(solution("00:00", Array(60, 120, 180, 250)))
    println(solution("20:18", Array(222, 342)))
  }

  def solution(takeOffTime: String, minutes: Array[Int]): Int = {
    import java.time.Instant

    val date = takeOffTime match {
      case "00:00" => ("2024-01-01T", 1)
      case _       => ("2023-12-31T", 0)
    }

    val newYear = Instant.parse("2024-01-01T00:00:00.000Z")

    val x = minutes
      .foldLeft((Instant.parse(date._1 + takeOffTime + ":00.000Z"), 0, 0))({ case ((x, y, a), z) =>
        (
          x.plusSeconds(60 * (z - a)).minusSeconds(3600),
          if (x.compareTo(newYear) <= 0 && x.plusSeconds(60 * (z - a)).compareTo(newYear) >= 0) { y + 1 }
          else y,
          z
        )
      })

    if (x._1.compareTo(newYear)<=0)
      x._2 + 1
    else x._2
  }

}
