package org.codesignal.arcade.intro

object Q46 {
  def main(args: Array[String]): Unit = {}

  def solution(votes: Array[Int], k: Int): Int = {

    var winners = 0
    val max = votes.max
    for (i <- votes) {
      if (k > 0 && i + k > max) {
        winners += 1
      }
      if (k == 0 && i == max && votes.count(_ == max) == 1) {
        winners += 1
      }
    }
    winners
  }

  // Above imperative is faster than below functional solution

  def solution2(votes: Array[Int], k: Int): Int = {
    val max = votes.max
    k match {
      case 0 =>
        if (votes.count(_ == max) == 1) { 1 }
        else { 0 }
      case _ => votes.count(_ + k > max)
    }
  }

}
