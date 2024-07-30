package org.hackerrank.yash.q6

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
   * Complete the 'staircase' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  def staircase(n: Int) {
    // Write your code here

    val x = for (i <- 1 to n) yield " " * (n - i) + "#" * i
    x.foreach(println)
  }

}

object Solution {
  def main(args: Array[String]) {
    val n = StdIn.readLine.trim.toInt

    Result.staircase(n)
  }
}
