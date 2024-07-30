package org.hackerank.algorithms.strings.DnaHealth
import scala.io._

object Solution {
  class Lazy[T](expr: => T) {
    lazy val value = expr
    def apply(): T = value
  }

  object Lazy {
    def apply[T](expr: => T) = new Lazy[T](expr)
  }

  private def findHealth(strand: String, geneHealth: Array[(String, Int)]): Int = {

    val geneHealthMap = geneHealth.groupBy(_._1).map(x => (x._1, x._2.map(_._2).sum))

    (for (
      i <- 0 until strand.length;
      j <- i until strand.length
    ) yield geneHealthMap.getOrElse(strand.slice(i, j + 1), 0)).sum
  }
  def main(args: Array[String]): Unit = {
    val n = StdIn.readLine.trim.toInt

    val genes = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val health = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val geneHealth = genes.zip(health)

    val s = StdIn.readLine.trim.toInt

    val x = for (sItr <- 1 to s) yield {
      val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

      val first = firstMultipleInput(0).toInt

      val last = firstMultipleInput(1).toInt

      val d = firstMultipleInput(2)
      findHealth(d, geneHealth.slice(first, last + 1))
    }
    println(s"${x.min} ${x.max}")

  }
}

object DnaHealth {}
