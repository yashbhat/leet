package org.hackerank.algorithms.implementation.MatrixLayerRotation

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

  /*
   * Complete the 'matrixRotation' function below.
   *
   * The function accepts following parameters:
   *  1. 2D_INTEGER_ARRAY matrix
   *  2. INTEGER r
   */

  def main(args: Array[String]): Unit = {
    matrixRotation(Array(Array(1, 2, 3, 4), Array(12, 1, 2, 5), Array(11, 4, 3, 6), Array(10, 9, 8, 7)), 2)
  }

  def matrixRotation(matrix: Array[Array[Int]], r: Int): Unit = {
    // Write your code here

    val m = matrix.length
    val n = matrix.head.length

    def oldPos(pos: (Int, Int), dim: (Int, Int) = (m, n), r: Int = r): (Int, Int) = {
      val ringLead = (pos._1 min (dim._1 - 1 - pos._1)) min (pos._2 min (dim._2 - 1 - pos._2))
      val ringDim = ((dim._1 - 1 - ringLead) - ringLead, (dim._2 - 1 - ringLead) - ringLead)

      val fullRotation = 2 * (ringDim._1 + ringDim._2)
      val ringPos = pos match {
        case (x, y) if y == ringLead => x - ringLead
        case (x, y) if x == (ringLead + ringDim._1) => ringDim._1 + y - ringLead
        case (x, y) if y == (ringLead + ringDim._2) => ringDim._1 + ringDim._2 + (ringLead + ringDim._1) - x
        case (x, y) => ringDim._1 + ringDim._2 + ringDim._1 + (ringLead + ringDim._2) - y
      }

      val oldRingPos = (((ringPos - r) % fullRotation) + fullRotation) % fullRotation
      val oldPos = oldRingPos match {
        case i if i <= ringDim._1 => (ringLead + i, ringLead)
        case i if i <= ringDim._1 + ringDim._2 => (ringLead + ringDim._1, ringLead + (i - ringDim._1))
        case i if i <= ringDim._1 + ringDim._2 + ringDim._1 => (ringLead + ringDim._1 - (i - (ringDim._1 + ringDim._2)), ringLead + ringDim._2)
        case i => (ringLead, ringLead + ringDim._2 - (i - (ringDim._1 + ringDim._2 + ringDim._1)))
      }
      oldPos
    }

    val newMatrix = for (i <- 0 until m;
                         row = for(j <- 0 until n;
                                   op = oldPos((i, j))) yield matrix(op._1)(op._2)) yield row

    newMatrix.foreach(x => println(x.mkString(" ")))


  }

}

object Solution {
  def main(args: Array[String]) {
    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val m = firstMultipleInput(0).toInt

    val n = firstMultipleInput(1).toInt

    val r = firstMultipleInput(2).toInt

    val matrix = Array.ofDim[Int](m, n)

    for (i <- 0 until m) {
      matrix(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    Result.matrixRotation(matrix, r)
  }
}

object MatrixLayerRotation {

}
