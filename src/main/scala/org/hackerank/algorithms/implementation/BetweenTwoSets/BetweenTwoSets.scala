package org.hackerank.algorithms.implementation.BetweenTwoSets

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.annotation.tailrec
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
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    def main(args: Array[String]): Unit = {
        val a = Array(2, 4)
        val b = Array(16, 32 , 96)
        getTotalX(a, b)
    }

    private def lcm(list: Array[Int]): Int = list.foldLeft(1: Int) { (a, b) =>
        b * a / gcd(a, b)
    }

    @tailrec
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def gcd(list: Array[Int]): Int = list.reduce(gcd)

    def getTotalX(a: Array[Int], b: Array[Int]): Int = {

        // Write your code here

        val _gcd = gcd(b)
        val _lcm = lcm(a)
        if (_gcd%_lcm != 0) {
            0
        }
        else {
            ((1 to (_gcd/_lcm)).count(x => _gcd %(_lcm*x)== 0))
        }
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = firstMultipleInput(0).toInt

        val m = firstMultipleInput(1).toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val brr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val total = Result.getTotalX(arr, brr)

        printWriter.println(total)

        printWriter.close()
    }
}

object BetweenTwoSets {

}
