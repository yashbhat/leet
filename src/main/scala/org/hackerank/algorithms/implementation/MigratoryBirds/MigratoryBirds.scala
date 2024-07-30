package org.hackerank.algorithms.implementation.MigratoryBirds
import java.io._
import scala.io._

object Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    def main(args: Array[String]): Unit = {
        println(migratoryBirds(Array(1,4,4,4,5,3)))
    }
    def migratoryBirds(arr: Array[Int]): Int = {
        // Write your code here
val x = arr.groupBy(identity).view.mapValues(_.length)
  val y = x.toMap.maxBy(_._2)
        x.filter(_._2 == y._2).minBy(_._1)._1
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.migratoryBirds(arr)

        printWriter.println(result)

        printWriter.close()
    }
}

object MigratoryBirds {

}
