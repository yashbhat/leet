package org.codesignal.arcade.core

object Q142 {

  def main(args: Array[String]): Unit = {}

  def solution(t: String, s: String): Boolean = {
    val pattern = s.map(ch => s".*[${ch}].*")
    return (pattern.mkString.r findFirstIn t) != None
  }


}
