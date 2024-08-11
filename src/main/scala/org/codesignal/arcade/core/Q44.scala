package org.codesignal.arcade.core

object Q44 {

  def main(args: Array[String]): Unit = { println(solution2(15)) }

  def solution(n: Int): Int = {
    (2 to n)
      .takeWhile(i => 2*n  / i >= i)
      .count(y => (y % 2 == 0 && n % y == y / 2) || (y % 2 == 1 && n % y == 0))
  }
  def solution2(n: Int): Seq[Int] = {
    (2 to n)
      .takeWhile(i => n  / i >= i)
      .foldLeft(Seq[Int]())((x, y) =>
        if ((y % 2 == 0 && n % y == y / 2) || (y % 2 == 1 && n % y == 0)) x.appended(y) else x
      )
  }

}
