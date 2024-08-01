package org.codesignal.arcade.intro

object Q32 {
  def main(args: Array[String]): Unit = {}

  def solution(a: Array[Int]): Int = {
    val temp = a.map(x => (x,a.map(b => (x-b).abs).sum))
    temp.filter(_._2 == temp.map(_._2).min).map(_._1).min
  }



}
