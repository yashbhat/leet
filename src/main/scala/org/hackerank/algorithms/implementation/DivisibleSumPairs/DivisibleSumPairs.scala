package org.hackerank.algorithms.implementation.DivisibleSumPairs

import java.io._
import scala.annotation.tailrec
import scala.collection.immutable._
import scala.io._

object Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */
    def main(args: Array[String]): Unit = {
        val ar = Array(1, 3,2,6,1,2)
        println(divisibleSumPairs(6, 3, ar))
    }

    @tailrec
    def countPairs(pairs: Int = 0, ar: Array[Int], countMap: Map[Int, Int], k: Int, index: Int = 0): Int = {
        if (index == ar.length) {
            pairs
        } else {
            val counter = if(ar(index)==0){0}else{k-ar(index)}
            countPairs(pairs + countMap(counter), ar, countMap.updatedWith(ar(index))(_.map(_ + 1)), k, index + 1)
        }
    }

    def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
        // Write your code here
        val countMap = (0 until k).map((_, 0)).toMap
        val remAr = ar.map(_ % k)

        countPairs(0, remAr, countMap, k)
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = firstMultipleInput(0).toInt

        val k = firstMultipleInput(1).toInt

        val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.divisibleSumPairs(n, k, ar)

        printWriter.println(result)

        printWriter.close()
    }
}

object DivisibleSumPairs {

}
