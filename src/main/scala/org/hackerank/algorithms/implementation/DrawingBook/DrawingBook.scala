package org.hackerank.algorithms.implementation.DrawingBook
import java.io._
import scala.io._

object Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    def pageCount(n: Int, p: Int): Int = {
        // Write your code here

        val page = n/2 *2 +1

        math.min(p/2, (n/2 *2 +1-p)/2)
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val p = StdIn.readLine.trim.toInt

        val result = Result.pageCount(n, p)

        printWriter.println(result)

        printWriter.close()
    }
}

object DrawingBook {

}
