package org.codesignal.arcade.core

object Q61 {

  def main(args: Array[String]): Unit = {
  }
  def solution(s: String, t: String): Int = {
    val smap = s.groupBy(identity).view.mapValues(_.length)
    val tmap = t.groupBy(identity).view.mapValues(_.length)

    s.length - (for (
      sc <- smap;
      count = if (!tmap.contains(sc._1)) {
        sc._2
      } else if (tmap(sc._1) >= sc._2) {
        0
      } else {
        sc._2 - tmap(sc._1)
      }
    ) yield count).sum
  }


}
