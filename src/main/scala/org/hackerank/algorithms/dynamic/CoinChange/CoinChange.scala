package org.hackerank.algorithms.dynamic.CoinChange

import java.io._
import scala.annotation.tailrec
import scala.io._

object Result {

  /*
   * Complete the 'getWays' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. LONG_INTEGER_ARRAY c
   */
  def main(args: Array[String]): Unit = {
    println(countGroups(Array("1100", "1110", "0110", "0001")))
//    minimalHeaviestSetA(Array(5, 3, 2, 4, 1, 2))
//    println(getWays(10, Array(2, 5, 3, 6)))
    //        println(isInterleave("aabcc", "dbbca", "aadbbcbcac"))
    //        println(editDistance("horse", "ros"))
  }

  def minimalHeaviestSetA(arr: Array[Int]): Array[Int] = {
    // Write your code here
    val map = arr.groupBy(identity).view.mapValues(_.length).toMap
    @tailrec
    def iterSetA(
        currElems: Seq[(Int, Int)] = Seq(),
        currSum: Int = 0,
        remElems: Seq[Int] = map.keys.toSeq.sorted.reverse,
        targetSum: Int = arr.sum / 2 + 1
    ): Array[Int] = {

      if (currSum + remElems.head * map(remElems.head) >= targetSum) {
        val a = (targetSum - currSum)
        val b = remElems.head

        ((
          remElems.head,
          a % b match {
            case 0 => a / b
            case _ => a / b + 1
          }
        ) +: currElems)
          .flatMap(x => (0 until x._2).map(_ => x._1))
          .toArray
      } else {
        iterSetA(
          (remElems.head, map(remElems.head)) +: currElems,
          currSum + remElems.head * map(remElems.head),
          remElems.tail,
          targetSum
        )
      }
    }
    iterSetA()
  }

  def countGroups(related: Array[String]): Int = {
    // Write your code here
    val dim = related.length

    @tailrec
    def iterGroups(
        groups: Map[Int, Boolean] = (0 until dim).map(x => (x, true)).toMap,
        curr: Int = 0
    ): Int = {
      println(groups)
      println(curr)
      if (curr == dim) {
        groups.count(_._2)
      }
      else {
        val relToCurr = for (i <- 0 until dim if related(curr)(i) == '1') yield i
        iterGroups(relToCurr.filterNot(_ == curr).foldLeft(groups)((x, y) => x.updated(y.max(curr), false)), curr + 1)
      }
    }

    iterGroups()
  }

  class Lazy[T](expr: => T) {
    lazy val value: T = expr

    def apply(): T = value
  }

  object Lazy {
    def apply[T](expr: => T) = new Lazy(expr)
  }

  def getWays(n: Int, c: Array[Long]): Long = {
    // Write your code here
    def go(i: Int, j: Int): Lazy[Long] = Lazy {
      if (i == 0) {
        1
      } else if (i < 0) {
        0
      } else if (j <= 0) {
        0
      } else if (i - c(j - 1).toInt < 0) {
        mem(i)(j - 1)()
      } else {
        mem(i - c(j - 1).toInt)(j)() + mem(i)(j - 1)()
      }
    }

    lazy val mem = Array.tabulate[Lazy[Long]](n + 1, c.length + 1)(go)
    go(n, c.length)()
  }

  def editDistance(s1: String, s2: String): Int = {
    def go(i: Int, j: Int): Lazy[Int] = Lazy {
      if (i == 0) j
      else if (j == 0) i
      else if (s1(i - 1) == s2(j - 1)) mem(i - 1)(j - 1)()
      else (mem(i - 1)(j)() + 1) min (mem(i)(j - 1)() + 1) min (mem(i - 1)(j - 1)() + 1)
    }

    lazy val mem = Array.tabulate[Lazy[Int]](s1.length + 1, s2.length + 1)(go)
    go(s1.length, s2.length)()
  }

  def isInterleave(s1: String, s2: String, s3: String): Boolean = {
    def go(i: Int, j: Int): Lazy[Boolean] = Lazy {
      (i, j) match {
        case (0, 0) => true
        case (0, _) => s2(j - 1) == s3(j - 1) && mem(0)(j - 1)()
        case (_, 0) => s1(i - 1) == s3(i - 1) && mem(i - 1)(0)()
        case _ if s1(i - 1) == s2(j - 1) && s1(i - 1) == s3(i + j - 1) =>
          mem(i - 1)(j)() || mem(i)(j - 1)()
        case _ if s1(i - 1) == s3(i + j - 1) => mem(i - 1)(j)()
        case _ if s2(j - 1) == s3(i + j - 1) => mem(i)(j - 1)()
        case _                               => false
      }
    }

    lazy val mem = Array.tabulate[Lazy[Boolean]](s1.length + 1, s2.length + 1)(go)
    (s1.length + s2.length == s3.length) && go(s1.length, s2.length).value
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val m = firstMultipleInput(1).toInt

    val c = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toLong)

    // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

    val ways = Result.getWays(n, c)

    printWriter.println(ways)

    printWriter.close()
  }
}

object CoinChange {}
