package org.codesignal.arcade.core

object Q143 {

  def main(args: Array[String]): Unit = {
    println(solution("cough\tbough"))
  }

  def solution(pairOfLines: String): Boolean = {
    val pattern = "(.{3}(?=[\t])).*(.{3}$)".r
    val res = pattern.findFirstMatchIn(pairOfLines)
    return res.map(_ group 1).get == res.map(_ group 2).get
  }



}
