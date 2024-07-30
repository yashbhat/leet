package org.hackerank.algorithms.implementation.SubarrayDivision
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
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    def birthday(s: Array[Int], d: Int, m: Int): Int = {
        // Write your code here

        s.sliding(m).count(_.sum == d)
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val d = firstMultipleInput(0).toInt

        val m = firstMultipleInput(1).toInt

        val result = Result.birthday(s, d, m)

        printWriter.println(result)

        printWriter.close()
    }
}

object SubarrayDivision {

}
