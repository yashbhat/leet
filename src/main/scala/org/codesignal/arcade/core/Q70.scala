package org.codesignal.arcade.core

object Q70 {

  def main(args: Array[String]): Unit = {}

  def solution(s: String): Boolean = {
    s.foldLeft((true, 'a' - 1))({
      case ((false, _), _)         => (false, 'a')
      case ((true, last), current) => (current.toInt > last, current.toInt)
    })._1
  }

}
