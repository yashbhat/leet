package org.hackerrank.yash.q3

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
   * Complete the 'aVeryBigSum' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts LONG_INTEGER_ARRAY ar as parameter.
   */

  def aVeryBigSum(ar: Array[Long]): Long = {
    // Write your code here
ar.sum
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arCount = StdIn.readLine.trim.toInt

    val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toLong)

    val result = Result.aVeryBigSum(ar)

    printWriter.println(result)

    printWriter.close()
  }
}

