package org.hackerank.algorithms.implementation.ElectronicsShop

import java.io.PrintWriter

object Solution {

    def maxSumPair(keyboards: Array[Int], drives: Array[Int], b: Int, currSum: Int = 0): Int = {
        if (keyboards.isEmpty || drives.isEmpty) {
            currSum
        } else {
            if (keyboards.head + drives.head > b) {
                maxSumPair(keyboards, drives.tail, b, currSum)
            } else {
                5

            }
        }
    }

    /*
     * Complete the getMoneySpent function below.
     */
    def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
        /*
         * Write your code here.
         */
        val sk = keyboards.sorted
        val sd = drives.sorted
        if (sk.head + sd.head > b) {
            -1
        } else {

            val y = for (k <- sk;
                         d <- sd.findLast(_ + k <= b)) yield k + d

            y.max
        }

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val bnm = stdin.readLine.split(" ")

        val b = bnm(0).trim.toInt

        val n = bnm(1).trim.toInt

        val m = bnm(2).trim.toInt

        val keyboards = stdin.readLine.split(" ").map(_.trim.toInt)

        val drives = stdin.readLine.split(" ").map(_.trim.toInt)
        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        val moneySpent = getMoneySpent(keyboards, drives, b)

        printWriter.println(moneySpent)

        printWriter.close()
    }
}

object ElectronicsShop {

}
