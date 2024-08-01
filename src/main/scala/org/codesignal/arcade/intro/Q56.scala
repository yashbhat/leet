package org.codesignal.arcade.intro

import scala.collection.immutable.{AbstractSeq, LinearSeq}

object Q56 {
  def main(args: Array[String]): Unit = {}
  def solution(product: Int): Int = {
    @scala.annotation.tailrec
    def getFactors(num: Int = product, factors: Seq[Int] = Seq()): Seq[Int] = {
      if (num == 1) {
        factors
      } else if (!(2 to 9).exists(product % _ == 0)) { Seq() }
      else {
        val x = (2 to 9).filter(product % _ == 0).last
        getFactors(num / x, factors.appended(x))
      }
    }
    product match {
      case 0 => 10
      case x if x < 10 => product
      case _ =>
        getFactors() match {
          case seq if seq.isEmpty => -1
          case seq                => seq.map(_.toString).reduce(_ + _).reverse.toInt
        }
    }
  }

  def solution2(product: Int): Int = {

    def enumerateSingleDigitFactors(num: Int = product, factors: Seq[Seq[Int]] = Seq()): Seq[Seq[Int]] = {
      if (num == 1) {
        factors
      } else if (!(2 to 9).exists(x => num % x == 0)) {
        Seq()
      } else {
        (2 to 9)
          .filter(x => num % x == 0)
          .flatMap(x => enumerateSingleDigitFactors(num / x, factors.map(_.appended(x))))
      }
    }
    if (product < 10) {
      product
    } else {
      val sdf = enumerateSingleDigitFactors(product)
      sdf.filter(_.length == sdf.map(_.length).min).map(x => x.sorted.map(_.toString).reduce(_ + _)).map(_.toInt).min
    }
  }

}
