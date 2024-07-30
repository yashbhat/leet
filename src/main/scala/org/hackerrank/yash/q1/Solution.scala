package org.hackerrank.yash.q1

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
   * Complete the 'simpleArraySum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY ar as parameter.
   */

  def simpleArraySum(ar: Array[Int]): Int = {
    ar.sum

  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arCount = StdIn.readLine.trim.toInt

    val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result.simpleArraySum(ar)

    printWriter.println(result)

    printWriter.close()
  }
}
