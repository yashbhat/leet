package org.codesignal.arcade.core

object Q75 {

  def main(args: Array[String]): Unit = {
  }

  def solution(votes: Array[Int], k: Int): Int = {
    val max = votes.max
    k match {
      case 0 =>
        if (votes.count(_ == max) == 1) { 1 }
        else { 0 }
      case _ => votes.count(_ + k > max)
    }
  }



}
