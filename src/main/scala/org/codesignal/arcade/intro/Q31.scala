package org.codesignal.arcade.intro

object Q31 {
  def main(args: Array[String]): Unit = {}

  def solution(deposit: Int, rate: Int, threshold: Int): Int = {
    val x = (Math.log10((threshold.toFloat / deposit.toFloat)) / Math.log10(
      (100.toDouble + rate.toDouble) / 100.toDouble
    )).ceil.toInt

    (1 to x + 5)
      .foldLeft((deposit.toDouble, 0))((savingsYear, year) =>
        if (savingsYear._1 >= threshold) { savingsYear }
        else { (savingsYear._1 * ((100.toDouble + rate.toDouble) / 100.toDouble), savingsYear._2 + 1) }
      )
      ._2
  }

}
