package org.hackerank.algorithms.implementation.BillDivision
import scala.io._

object Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    def bonAppetit(bill: Array[Int], k: Int, b: Int) {
        // Write your code here

        val x  = b - (bill.sum - bill(k) )/2
        val y = x match {
            case 0 => "Bon Appetit"
            case _ => s"$x"
        }
        println(y)

    }

}

object Solution {
    def main(args: Array[String]) {
        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = firstMultipleInput(0).toInt

        val k = firstMultipleInput(1).toInt

        val bill = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val b = StdIn.readLine.trim.toInt

        Result.bonAppetit(bill, k, b)
    }
}

object BillDivision {

}
