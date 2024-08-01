package org.codesignal.arcade.intro

object Q10 {
  def main(args: Array[String]): Unit = {
    println(solution("abca", "xyzbac"))
  }
  def solution(s1: String, s2: String): Int = {
    val s1Map = s1.groupBy(identity).view.mapValues(_.length)
    val s2Map = s2.groupBy(identity).view.mapValues(_.length)
    s1Map.keySet.union(s2Map.keySet).toSeq.map(c => s1Map.getOrElse(c, 0).min(s2Map.getOrElse(c, 0))).sum
  }

}
