package org.hackerank.algorithms.implementation.AppleOrange

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
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
        // Write your code here
        println(apples.count(d => a + d >= s && a + d <= t))
        println(oranges.count(d => b + d >= s && b + d <= t))
    }

}

object Solution {
    def main(args: Array[String]) {
        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val s = firstMultipleInput(0).toInt

        val t = firstMultipleInput(1).toInt

        val secondMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val a = secondMultipleInput(0).toInt

        val b = secondMultipleInput(1).toInt

        val thirdMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val m = thirdMultipleInput(0).toInt

        val n = thirdMultipleInput(1).toInt

        val apples = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val oranges = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        Result.countApplesAndOranges(s, t, a, b, apples, oranges)
    }
}

case class AppleOrange()
