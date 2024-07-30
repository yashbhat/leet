package org.hackerank.algorithms.implementation.NonDivisableSubset

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'nonDivisibleSubset' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER k
   *  2. INTEGER_ARRAY s
   */
  def main(args: Array[String]): Unit = {
    println(nonDivisibleSubset(4, Array(19, 10, 12, 10, 25, 24, 22)))
  }

  def nonDivisibleSubset(k: Int, s: Array[Int]): Int = {
    // Write your code here
    val rems = s.map(_ % k).groupBy(identity).view.mapValues(_.length)
    ((1 to (k - 1) / 2).map(x => rems.getOrElse(x,0) max rems.getOrElse(k - x,0)).sum) +
      (if (rems.getOrElse(0, 0) == 0) {
        0
      } else {
        1
      }) + (if (k % 2 == 0 && (rems.getOrElse(k / 2, 0) > 0)) {
      1
    } else {
      0
    })
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val k = firstMultipleInput(1).toInt

    val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result.nonDivisibleSubset(k, s)

    printWriter.println(result)

    printWriter.close()
  }
}

object NonDivisableSubset {

}
