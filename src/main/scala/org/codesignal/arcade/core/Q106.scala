package org.codesignal.arcade.core

object Q106 {

  def main(args: Array[String]): Unit = {}

  def solution(grid: Array[Array[Int]]): Boolean = {
    grid.forall(_.sorted sameElements Array(1, 2, 3, 4, 5, 6, 7, 8, 9)) &&
      grid.transpose.forall(_.sorted sameElements Array(1, 2, 3, 4, 5, 6, 7, 8, 9)) && {
      Seq((0, 0), (0, 3), (0, 6), (3, 0), (3, 3), (3, 6), (6, 0), (6, 3), (6, 6))
        .map({ case (x, y) =>
          (for (
            i <- 0 to 2;
            j <- 0 to 2
          ) yield (i, j)).map({ case (a, b) =>
            (x + a, y + b)
          })
        })
        .forall(x => x.map({ case (i, j) => grid(i)(j) }).sorted sameElements Array(1, 2, 3, 4, 5, 6, 7, 8, 9))
    }
  }
}
