package org.codesignal.arcade.core

object Q60 {

  def main(args: Array[String]): Unit = {println(solution("aa", "bc"))}

  def solution(string1: String, string2: String): Boolean = {
    val x = string1
      .zip(string2)
      .foldLeft((true, Map[Char, Char]()))({
        case ((false, m), _) => (false, m)
        case ((f, m), y)     => println(m) ;(f && ((m.contains(y._1) && m(y._1)==y._2)|| !m.contains(y._1) && !m.exists(_._2==y._2)), m.updated(y._1, y._2))
      })
    println(x._2)
      x._1
  }

}
