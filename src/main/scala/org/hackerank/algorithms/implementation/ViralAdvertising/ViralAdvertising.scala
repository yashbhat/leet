package org.hackerank.algorithms.implementation.ViralAdvertising
import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'viralAdvertising' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER n as parameter.
   */
  def main(args: Array[String]): Unit = {
    println(viralAdvertising(5))
  }
  def viralAdvertising(n: Int): Int = {
    // Write your code here
    println((1 until n).scanLeft((5, 2))((x, y) => (x._2 * 3, (x._2 * 3)/2)).map(_._2))
    (1 until n).scanLeft((5, 2))((x, y) => (x._2 * 3, (x._2 * 3)/2)).map(_._2).sum
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val result = Result.viralAdvertising(n)

    printWriter.println(result)

    printWriter.close()
  }
}

object ViralAdvertising {

}
