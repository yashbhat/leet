package org.hackerank.algorithms.dynamic.Equal
import java.io._
import scala.io._

object Result {

    /*
     * Complete the 'equal' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    class Lazy[T](expr: => T) {
        lazy val value = expr

        def apply(): T = value
    }

    object Lazy {
        def apply[T](expr: => T) = new Lazy(expr)
    }

    def equal(arr: Array[Int]): Int = {
        // Write your code here
        Array(0, 1, 2).map(x => (arr.map(y => {val dist = y - (arr.min-x); dist/5 + (dist%5)/2 + (dist%5)%2}).sum)).min
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = StdIn.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val n = StdIn.readLine.trim.toInt

            val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
            val result = Result.equal(arr)

            printWriter.println(result)
        }

        printWriter.close()
    }
}

object Equal {

}
