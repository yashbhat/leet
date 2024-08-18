package org.codesignal.arcade.core

object Q147 {

  def main(args: Array[String]): Unit = {}

  def solution(lrcLyrics: Array[String], songLength: String): Array[String] = {

    def convert(lrcTime: String): String = {
      val x = lrcTime.split(':')
      val hour = if (x(0).toInt > 59) { "01" }
      else { "00" }
      val minute = ("0" + x(0).toInt % 60).takeRight(2)
      val second = x(1).replace('.', ',') + "0"
      s"$hour:$minute:$second"
    }

    val len = lrcLyrics.length
    val subRipTime = songLength + ",000"
    (for (
      x <- lrcLyrics.indices;
      y = Array(
        s"${x + 1}",
        s"${convert(lrcLyrics(x).substring(1, 9))} --> ${if (x == len - 1) { subRipTime }
        else { convert(lrcLyrics(x + 1).substring(1, 9)) }}",
        s"${if (lrcLyrics(x).length>10){lrcLyrics(x).substring(11)} else{""}}"
      )
    ) yield y).reduce((x, y) => x.appended("").appendedAll(y))
  }

}
