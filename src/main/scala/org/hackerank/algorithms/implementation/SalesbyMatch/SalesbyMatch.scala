package org.hackerank.algorithms.implementation.SalesbyMatch
import java.io._
import scala.io._

object Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    def sockMerchant(n: Int, ar: Array[Int]): Int = {
        // Write your code here
ar.groupBy(identity).view.mapValues(_.length).map(_._2/2).sum
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.sockMerchant(n, ar)

        printWriter.println(result)

        printWriter.close()
    }
}

object SalesbyMatch {

}
