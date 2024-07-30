package org.hackerank.algorithms.dynamic.ConstructArray

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'countArray' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER k
   *  3. INTEGER x
   */

  class Lazy[T](expr: => T) {
    lazy val value = expr

    def apply(): T = value
  }

  object Lazy {
    def apply[T](expr: => T) = new Lazy(expr)
  }

  def main(args: Array[String]): Unit = {
    println(countArray(4, 3, 2))
    println(countArray(3, 3, 1))
  }

  def modulo(quotient: Long, divisor: Long): Long = {
    val mod = quotient % divisor
    if(mod<0){
      mod + divisor
    }
    else{
      mod
    }
  }

  def countArray(n: Int, k: Int, x: Int): Long = {
    // Return the number of ways to fill in the array.

    val div = scala.math.pow(10, 9).toLong + 7

    def go(i: Int, isX1: Int): Lazy[Long] = Lazy {
      // isX1 = 1 iff x == 1
      (i, isX1) match {
        case (1, 0) => 0
        case (1, 1) => 1
        case (2, 0) => 1
        case (2, 1) => 0
        case (_, 0) => mem(i - 1)(0)() * (k - 2) + mem(i - 1)(1)()
        case (_, 1) => mem(i - 1)(0)() * (k - 1)
      }
    }

    lazy val mem = Array.tabulate[Lazy[Long]](n + 1, 2)(go)

    if (x == 1) {
      modulo( go(n, 0)(), div)
    }
    else {
     modulo( go(n, 0)(), div)
    }

    if (n % 2 == 1) {
      val y = (scala.math.pow(k - 1, n - 3).toLong - 1) / k
      if (x == 1) {
        ((y + 1) * (k - 1)) + ((k - 1) * y * (k - 2))
      }
      else {
        ((((k - 1) * y) + 1) * (k - 2)) + (y * (k - 1))
      }
    }
    else {
      val y = (scala.math.pow(k - 1, n - 3).toLong + 1) / k
      if (x == 1) {
        ((y - 1) * (k - 1)) + ((k - 1) * y * (k - 2))
      }
      else {
        ((((k - 1) * y) - 1) * (k - 2)) + (y * (k - 1))
      }

    } % div


  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val k = firstMultipleInput(1).toInt

    val x = firstMultipleInput(2).toInt

    val answer = Result.countArray(n, k, x)

    printWriter.println(answer)

    printWriter.close()
  }
}

object ConstructArray {

}
