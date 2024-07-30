package org.hackerank.algorithms.implementation.NumberLinesJump

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
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
        // Write your code here

        if (x1 == x2) {
            "YES"
        }
        else if (v1 == v2) {
            "NO"
        }
        else if( ((x1 - x2) / (v2 - v1)) > 0 && ((x1 - x2) % (v2 - v1)) ==0 ){

            "YES"
        }
        else{
            "NO"
        }

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val x1 = firstMultipleInput(0).toInt

        val v1 = firstMultipleInput(1).toInt

        val x2 = firstMultipleInput(2).toInt

        val v2 = firstMultipleInput(3).toInt

        val result = Result.kangaroo(x1, v1, x2, v2)

        printWriter.println(result)

        printWriter.close()
    }
}

object NumberLinesJumps {

}
