package org.codesignal.arcade.intro

object Q41 {
  def main(args: Array[String]): Unit = {}
  def solution(n: Int): Int = {
    import scala.annotation.tailrec
    @tailrec
    def degree(int: Int, deg: Int = 0):Int ={
      if (int<10){
        deg
      }
      else {
        degree(int.toString.map(_.toString.toInt).sum, deg + 1)
      }
    }
    degree(n)
  }



}
