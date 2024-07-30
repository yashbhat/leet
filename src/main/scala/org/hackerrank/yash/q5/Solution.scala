package org.hackerrank.yash.q5

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
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  def plusMinus(arr: Array[Int]) {
    // Write your code here
    val pos = arr.count(_>0).toFloat / arr.length
    val neg = arr.count(_<0).toFloat / arr.length
    val zer = arr.count(_==0).toFloat / arr.length
    println(f"$pos%1.6f")
    println(f"$neg%1.6f")
    println(f"$zer%1.6f")
  }

}

object Solution {
  def main(args: Array[String]) {
    val n = StdIn.readLine.trim.toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    Result.plusMinus(arr)
  }
}
