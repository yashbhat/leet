package org.hackerank.algorithms.implementation.AngryProfessor
import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'angryProfessor' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. INTEGER k
   *  2. INTEGER_ARRAY a
   */

  def angryProfessor(k: Int, a: Array[Int]): String = {
    // Write your code here
    a.count(_<=0) match {
      case x if x < k => "YES"
      case _ => "NO"
    }
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = StdIn.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

      val n = firstMultipleInput(0).toInt

      val k = firstMultipleInput(1).toInt

      val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
      val result = Result.angryProfessor(k, a)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

object AngryProfessor {

}
