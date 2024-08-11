package org.codesignal.arcade.core

object Q33 {
  def main(args: Array[String]): Unit = {}
  def solution(candlesNumber: Int, makeNew: Int): Int = {

    import scala.annotation.tailrec
    @tailrec
    def makeCandles(cn: Int = candlesNumber, lo: Int = 0, burnt: Int = 0): Int = {
      if (cn == 0) { burnt }
      else {
        makeCandles((cn + lo) / makeNew, (cn + lo) % makeNew, burnt + cn)
      }
    }

    makeCandles()
  }

}
