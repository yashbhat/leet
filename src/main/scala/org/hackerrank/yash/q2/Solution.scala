package org.hackerrank.yash.q2


import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

  /*
   * Complete the 'compareTriplets' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    val c = a.zip(b)
    Array(c.count(x => x._1 > x._2), c.count(x => x._1 < x._2))
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result.compareTriplets(a, b)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
