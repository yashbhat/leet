package org.hackerank.algorithms.implementation.ExtraLongFactorials

import scala.annotation.tailrec
import scala.io._

object Result {

  /*
   * Complete the 'extraLongFactorials' function below.
   *
   * The function accepts INTEGER n as parameter.
   */
  def main(args: Array[String]): Unit = {
    extraLongFactorials(20)
  }
  def extraLongFactorials(n: Int) {
    // Write your code here

    @tailrec
    def fact(bigInt: BigInt = BigInt(n), currFact: BigInt = BigInt(1)): BigInt = {
      bigInt match {
        case x if x == BigInt(1) => currFact
        case _ => fact(bigInt - 1, currFact * bigInt)
      }
    }

    println(fact().toString)
  }

}

object Solution {
  def main(args: Array[String]) {
    val n = StdIn.readLine.trim.toInt

    Result.extraLongFactorials(n)
  }
}

object ExtraLongFactorials {

}
