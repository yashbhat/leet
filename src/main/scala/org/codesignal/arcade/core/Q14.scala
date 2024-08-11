package org.codesignal.arcade.core

object Q14 {
  def main(args: Array[String]): Unit = {}

  def solution(score1: Int, score2: Int): Boolean = {
    (score1 != score2) && (if (score1.min(score2) >= 5) { score1.max(score2) == 7 }
                           else {
                             score1.max(score2) == 6
                           })
  }

}
