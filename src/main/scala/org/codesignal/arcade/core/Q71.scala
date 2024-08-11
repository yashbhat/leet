package org.codesignal.arcade.core

object Q71 {

  def main(args: Array[String]): Unit = { println(solution(Array(1, 2, 10), 28)) }

  def solution(coins: Array[Int], price: Int): Int = {
    import scala.annotation.tailrec
    @tailrec
    def recCoins(c: Array[Int] = coins.reverse, coinsUsed: Int = 0, remPrice: Int = price): Int = {
      if (remPrice == 0) {
        coinsUsed
      } else if (c.head > remPrice) {
        recCoins(c.tail, coinsUsed, remPrice)
      } else {
        recCoins(c.tail, coinsUsed + remPrice / c.head, remPrice - c.head * (remPrice / c.head))
      }
    }
    recCoins()
  }

}
