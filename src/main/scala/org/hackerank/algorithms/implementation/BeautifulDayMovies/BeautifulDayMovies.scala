package org.hackerank.algorithms.implementation.BeautifulDayMovies
import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'beautifulDays' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER i
   *  2. INTEGER j
   *  3. INTEGER k
   */

  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    // Write your code here
    (i to j).map(x => x.toString.reverse.toInt - x).count(_ % k == 0)
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val i = firstMultipleInput(0).toInt

    val j = firstMultipleInput(1).toInt

    val k = firstMultipleInput(2).toInt

    val result = Result.beautifulDays(i, j, k)

    printWriter.println(result)

    printWriter.close()
  }
}

object BeautifulDayMovies {

}
