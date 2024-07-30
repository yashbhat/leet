package org.hackerank.algorithms.implementation.CircularArrayRotation

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'circularArrayRotation' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER k
   *  3. INTEGER_ARRAY queries
   */
  def main(args: Array[String]): Unit = {
    circularArrayRotation(Array(3,4,5), 2, Array(1,2))
  }
  def circularArrayRotation(a: Array[Int], k: Int, queries: Array[Int]): Array[Int] = {
    // Write your code here
    val size = a.length
    val rotate: Array[Int] = a.drop(size - (k % size)) ++ a.take(size - (k % size))
    queries.map(x=> rotate(x))
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val k = firstMultipleInput(1).toInt

    val q = firstMultipleInput(2).toInt

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val queries = Array.ofDim[Int](q)

    for (i <- 0 until q) {
      val queriesItem = StdIn.readLine.trim.toInt
      queries(i) = queriesItem
    }

    val result = Result.circularArrayRotation(a, k, queries)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}

object CircularArrayRotation {

}
