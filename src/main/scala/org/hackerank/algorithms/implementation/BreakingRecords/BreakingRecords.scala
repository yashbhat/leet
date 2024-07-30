package org.hackerank.algorithms.implementation.BreakingRecords

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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */
    def main(args: Array[String]): Unit = {
        val a = Array(12, 24, 10, 24)
        breakingRecords(a)
    }

    def breakingRecords(scores: Array[Int]): Array[Int] = {
        // Write your code here
        val x = scores.foldLeft(((scores.head, 0), (scores.head, 0)))((x, y) => (y > x._1._1, y < x._2._1) match {
            case (false, false) => x
            case (true, false) => ((y, x._1._2 + 1), x._2)
            case (false, true) => (x._1, (y, x._2._2 + 1))
        })
        Array(x._1._2, x._2._2)
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val scores = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.breakingRecords(scores)

        printWriter.println(result.mkString(" "))

        printWriter.close()
    }
}

object BreakingRecords {

}
