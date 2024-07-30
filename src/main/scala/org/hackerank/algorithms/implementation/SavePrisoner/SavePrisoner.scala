package org.hackerank.algorithms.implementation.SavePrisoner

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'saveThePrisoner' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER m
   *  3. INTEGER s
   */

  def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
    // Write your code here

    val x = (m + s - 1) % n
    if (x <= 0){x+n}else{x}
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = StdIn.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

      val n = firstMultipleInput(0).toInt

      val m = firstMultipleInput(1).toInt

      val s = firstMultipleInput(2).toInt

      val result = Result.saveThePrisoner(n, m, s)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

object SavePrisoner {

}
