package org.hackerank.algorithms.implementation.PickingNumbers

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'pickingNumbers' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY a as parameter.
   */


  def pickingNumbers(a: Array[Int]): Int = {
    // Write your code here
      val getCountMap = a.groupBy(identity).view.mapValues(_.length)
      (for (key <- a.min to a.max;
         sum = getCountMap.getOrElse(key, 0) + getCountMap.getOrElse(key + 1, 0)) yield sum
      ).max


  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result.pickingNumbers(a)

    printWriter.println(result)

    printWriter.close()
  }
}

object PickingNumbers {

}
