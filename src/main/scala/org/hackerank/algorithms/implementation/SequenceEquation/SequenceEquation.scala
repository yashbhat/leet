package org.hackerank.algorithms.implementation.SequenceEquation
import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'permutationEquation' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY p as parameter.
   */

  def permutationEquation(p: Array[Int]): Array[Int] = {
    // Write your code here
    (for (x <- 1 to p.length;
          y<- p.indices;
          z = y + 1 if p(p(y)-1) == x) yield z).toArray
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val p = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result.permutationEquation(p)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}

object SequenceEquation {

}
