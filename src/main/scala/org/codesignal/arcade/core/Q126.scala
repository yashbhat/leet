package org.codesignal.arcade.core

object Q126 {

  def main(args: Array[String]): Unit = {}


  def solution(boardSize: Array[Int], initPosition: Array[Int], initDirection: Array[Int], k: Int): Array[Int] = {

    def update(a: ((Int, Int), (Int, Int))): ((Int, Int), (Int, Int)) = {
      val (pXP, pYP) = (a._1._1 + a._2._1, a._1._2 + a._2._2)
      val (nXP, nXD) = if (pXP < 0 || pXP >= boardSize(0)) {
        (a._1._1, a._2._1 * -1)
      } else {
        (pXP, a._2._1)
      }
      val (nYP, nYD) = if (pYP < 0 || pYP >= boardSize(1)) {
        (a._1._2, a._2._2 * -1)
      } else {
        (pYP, a._2._2)
      }
      ((nXP, nYP), (nXD, nYD))

    }
    val iPT = (initPosition(0), initPosition(1))
    val iDT = (initDirection(0), initDirection(1))
    val n = if (k > boardSize(0) * boardSize(1) * 4) {
      k % ((1 to boardSize(0) * boardSize(1) * 4)
        .scanLeft((iPT, iDT))((x, y) => update(x))
        .drop(1)
        .indexOf((iPT, iDT)) + 1)
    } else k
    val (fPT, fDT) = (1 to n).foldLeft((iPT, iDT))((x, y) => update(x))
    Array(fPT._1, fPT._2)
  }
}
