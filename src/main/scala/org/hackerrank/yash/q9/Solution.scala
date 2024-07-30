package org.hackerrank.yash.q9

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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    def timeConversion(s: String): String = {
        // Write your code here
        val t = s.substring(9) match {
            case "AM" => s.substring(0, 9)
            case "PM" => s.substring(0, 2).toInt + 12 + s.substring(2,9)
        }

        t.substring(0, 2) match {
            case "12" => t.substring(0, 2).toInt -12 + t.substring(2,9)
            case _ => t
        }

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = StdIn.readLine

        val result = Result.timeConversion(s)

        printWriter.println(result)

        printWriter.close()
    }
}


