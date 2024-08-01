package org.codesignal.arcade.intro

object Q57 {
  def main(args: Array[String]): Unit = {}

  def solution(names: Array[String]): Array[String] = {
    def add(x: Array[String], y: String): Array[String] = {
      val count = x.count(_.startsWith(y))
      val l = (1 to count).dropWhile(k => x.contains(s"$y($k)")).head
      x.appended(s"$y($l)")
    }
    names.foldLeft(Array[String]())((x, y) =>
      if (x.contains(y)) { add(x, y) }
      else { x.appended(y) }
    )
  }

}
