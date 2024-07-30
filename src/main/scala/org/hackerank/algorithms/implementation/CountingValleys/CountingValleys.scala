package org.hackerank.algorithms.implementation.CountingValleys

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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    def main(args: Array[String]): Unit = {
        val steps = 8
        val path = "UDDDUDUU"
        println(countingValleys(steps, path))
    }
    def countingValleys(steps: Int, path: String): Int = {
        // Write your code here
        path.toCharArray.scanLeft(0)((x, y) => if (y == 'U') {
            x + 1
        } else {
            x - 1
        }).foldLeft(0, "S")((x, y) => (x._2, y) match {
            case ("V", 0) => (x._1 + 1, "S")
            case ("M", 0) => (x._1, "S")
            case ("S", 1) => (x._1, "M")
            case ("S", -1) => (x._1, "V")
            case _ => x
        })._1
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val steps = StdIn.readLine.trim.toInt

        val path = StdIn.readLine

        val result = Result.countingValleys(steps, path)

        printWriter.println(result)

        printWriter.close()
    }
}

object CountingValleys {

}
