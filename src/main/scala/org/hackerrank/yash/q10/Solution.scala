package org.hackerrank.yash.q10

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
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. LONG_INTEGER k
     *  2. STRING a
     *  3. STRING b
     */

    def twoStrings(k: Long, a: String, b: String): Array[String] = {
        // Write your code here
        (a.length, b.length, k) match {
            case (_, _, 1L) => Array("", "")
            case (_, _, 1L) => Array("", "")
            case (_, _, x) if k < b.length/2 => Array()
        }
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = firstMultipleInput(0).toInt

        val m = firstMultipleInput(1).toInt

        val k = firstMultipleInput(2).toLong

        val a = StdIn.readLine

        val b = StdIn.readLine

        val result = Result.twoStrings(k, a, b)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}



