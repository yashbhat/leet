package org.hackerank.algorithms.implementation.UtopianTree

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'utopianTree' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER n as parameter.
   */
  def main(args: Array[String]): Unit = {
    println(utopianTree(5))
  }
  def utopianTree(n: Int): Int = {
    // Write your code here
    (1 to n).foldLeft(1)((x, y) => if(y%2==0){x + 1} else{2*x})
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = StdIn.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = StdIn.readLine.trim.toInt

      val result = Result.utopianTree(n)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

object UtopianTree {

}
