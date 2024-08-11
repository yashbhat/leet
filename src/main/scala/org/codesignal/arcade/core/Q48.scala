package org.codesignal.arcade.core

object Q48 {

  def main(args: Array[String]): Unit = { println(solution(9).mkString("Array(", ", ", ")")) }

  def solution(n: Int): Array[Int] = {
    def getDivisors(x: Int): Int = { (1 to x).count(x % _ == 0) }

    val divisors = (1 to n).map(getDivisors)

    val weaknesses = (1 to n).foldLeft(Seq[Int]())((x, y) => x.appended(divisors.take(y - 1).count(_ > divisors(y-1))))
    val max = weaknesses.max
    Array(max, weaknesses.count(_ == max))
  }

}
