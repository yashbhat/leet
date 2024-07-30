package org.hackerrank.yash.q8

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
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    def birthdayCakeCandles(candles: Array[Int]): Int = {
        // Write your code here
        // candles.count(_ == candles.max)

        var max = 1
        var maxcount = 0
        for (x <- candles){
            if(x==max){
                maxcount+=1
            }
            else if(x>max){
                max = x
                maxcount = 1
            }
        }
        maxcount
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val candlesCount = StdIn.readLine.trim.toInt

        val candles = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.birthdayCakeCandles(candles)

        printWriter.println(result)

        printWriter.close()
    }
}



