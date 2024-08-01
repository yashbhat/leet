package org.codesignal.arcade.intro

object Q33 {
  def main(args: Array[String]): Unit = {
    solution(Array("aba", "bbb", "bab"))
  }

  def solution(inputArray: Array[String]): Boolean = {
    def isOneDiffer(a: String, b: String): Boolean = {
      a.length == b.length && (
        for (
          x <- a.indices;
          y = a(x) if a(x) != b(x)
        ) yield y
      ).length < 2
    }
    def isOneDifferAr(inputArray: Array[String]): Boolean = {
      inputArray.tail.foldLeft((true, inputArray.head))((x, y) => (x._1 && isOneDiffer(x._2, y), y))._1
    }
    inputArray.permutations.exists(isOneDifferAr)

  }

}
