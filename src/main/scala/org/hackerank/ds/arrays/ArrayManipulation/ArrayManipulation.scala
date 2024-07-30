package org.hackerank.ds.arrays.ArrayManipulation

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'arrayManipulation' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. 2D_INTEGER_ARRAY queries
   */

  def main(args: Array[String]): Unit = {
    println(arrayManipulation(10, Array(Array(1, 5, 3), Array(4, 8, 7), Array(6, 9, 1))))
  }

  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    // Write your code here
    queries
      .foldLeft((0 until n).map(_ => 0L))((ar, query) =>
        for (
          i <- ar.indices;
          x =
            if ((query(0) <= i + 1) && (i + 1 <= query(1))) {
              ar(i) + query(2)
            } else {
              ar(i)
            }
        ) yield x
      )
      .max

    queries
      .foldLeft((0 to n).map(_ => 0L))((ar, query) =>
        ar.updated(query(0) - 1, ar(query(0) - 1) + query(2)).updated(query(1), ar(query(1)) - query(2))
      )
      .scanLeft(0L)(_ + _)
      .max

    val map = queries.foldLeft(Map[Int, Long]())((m, query) =>
      m.updated(query(0) - 1, m.getOrElse(query(0) - 1, 0L) + query(2))
        .updated(query(1), m.getOrElse(query(1), 0L) - query(2))
    )
map.keys.toArray.sorted.scanLeft(0L)((x, key) => x + map(key)).max
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val m = firstMultipleInput(1).toInt

    val queries = Array.ofDim[Int](m, 3)

    for (i <- 0 until m) {
      queries(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val result = Result.arrayManipulation(n, queries)

    printWriter.println(result)

    printWriter.close()
  }
}

object ArrayManipulation {}
