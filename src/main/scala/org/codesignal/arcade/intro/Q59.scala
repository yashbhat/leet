package org.codesignal.arcade.intro

object Q59 {
  def main(args: Array[String]): Unit = {
    solution(4).map(_.toSeq).foreach(println)
  }

  def solution(n: Int): Array[Array[Int]] = {

    def nextCoor(curr: (Int, Int), phase: Int): (Int, Int) = phase match {
      case 1 => (curr._1, curr._2 + 1)
      case 2 => (curr._1 + 1, curr._2)
      case 3 => (curr._1, curr._2 - 1)
      case 4 => (curr._1 - 1, curr._2)
    }

    def updateMatrix(mat: Array[Array[Int]], pos: (Int, Int), value: Int): Array[Array[Int]] =
      mat.updated(pos._1, mat(pos._1).updated(pos._2, value))

    def updateRem(rem: (Int, Int, Int)): (Int, Int, Int) = rem match {
      case (4, b, c) if b + 1 == c => (1, -1, c - 2)
      case (a, b, c) if b == c     => (a + 1, 0, c)
      case (a, b, c)               => (a, b + 1, c)
    }

    (1 to n * n)
      .foldLeft((Array.fill(n, n)(0), (0, 0), (1, 0, n - 2)))((x, y) => {
        (updateMatrix(x._1, x._2, y), nextCoor(x._2, x._3._1), updateRem(x._3))
      })
      ._1
  }

}
