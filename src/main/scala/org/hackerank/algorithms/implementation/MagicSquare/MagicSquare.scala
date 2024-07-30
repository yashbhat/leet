package org.hackerank.algorithms.implementation.MagicSquare
import java.io._
import scala.io._

object Result {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    val magicSquares = Array(
    Array(Array(8,1,6),Array(3,5,7),Array(4,9,2)),
    Array(Array(6,1,8),Array(7,5,3),Array(2,9,4)),
    Array(Array(4,9,2),Array(3,5,7),Array(8,1,6)),
    Array(Array(2,9,4),Array(7,5,3),Array(6,1,8)),
    Array(Array(8,3,4),Array(1,5,9),Array(6,7,2)),
    Array(Array(4,3,8),Array(9,5,1),Array(2,7,6)),
    Array(Array(6,7,2),Array(1,5,9),Array(8,3,4)),
    Array(Array(2,7,6),Array(9,5,1),Array(4,3,8)),
    )

    def dist(s: Array[Array[Int]], x: Array[Array[Int]]): Int = (for(a <- 0 until 3;
                                                                    b <- 0 until 3) yield (s(a)(b) - x(a)(b)).abs).sum

    def formingMagicSquare(s: Array[Array[Int]]): Int = {
        // Write your code here
        magicSquares.map(x => dist(x, s)).min
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = Array.ofDim[Int](3, 3)

        for (i <- 0 until 3) {
            s(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        }

        val result = Result.formingMagicSquare(s)

        printWriter.println(result)

        printWriter.close()
    }
}

object MagicSquare {

}
