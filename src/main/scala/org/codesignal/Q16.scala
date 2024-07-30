package org.codesignal

object Q16 {
  def main(args: Array[String]): Unit = {
    solution(Array(1, 2, 3), Array(2, 1, 3))
  }

  def solution(a: Array[Int], b: Array[Int]): Boolean = {
    val diffIndices =
      for (
        x <- a.indices;
        y = x if a(x) != b(x)
      ) yield y
    diffIndices.length match {
      case x if x == 0 => true
      case x if x == 2 => a(diffIndices(0)) == b(diffIndices(1)) && a(diffIndices(1)) == b(diffIndices(0))
      case _           => false
    }

  }

}
