package org.codesignal.arcade.core

object Q105 {

  def main(args: Array[String]): Unit = {

    solution(
      Array(
        Array(1, 0, 0, 2, 0, 0, 0),
        Array(0, 1, 0, 2, 3, 3, 3),
        Array(0, 0, 1, 2, 0, 0, 0),
        Array(8, 8, 8, 9, 4, 4, 4),
        Array(0, 0, 7, 6, 5, 0, 0)
      ),
      3,
      Array(1, 5),
      81
    ).foreach(x => println(x.mkString(", ")))

  }

  def solution(matrix: Array[Array[Int]], width: Int, center: Array[Int], t: Int): Array[Array[Int]] = {
    def mod(a: Int): Int = if (a > 0) { a }
    else { 0 - a }
    def isStar(a: Int, b: Int): Boolean = {
      ((mod(a - center(0)) == mod(b - center(1))) && mod(a - center(0)) <= width / 2) ||
      ((a == center(0) && mod(b - center(1)) <= width / 2)) ||
      ((b == center(1) && mod(a - center(0)) <= width / 2))
    }

    val circle = Seq((0, -1), (-1, -1), (-1, 0), (-1, 1), (0, 1), (1, 1), (1, 0), (1, -1))
    def getDir(a: Int, b: Int): (Int, Int) = (
      a match {
        case 0          => 0
        case x if x > 0 => 1
        case _          => -1
      },
      b match {
        case 0          => 0
        case x if x > 0 => 1
        case _          => -1
      }
    )

    def tabulate(i: Int, i1: Int): Int = {
      val rot = t % 8
      if (rot == 0) {
        matrix(i)(i1)
      } else if ((i, i1) == (center(0), center(1))) {
        matrix(i)(i1)
      } else if (isStar(i, i1)) {
        val oldIndex = circle((circle.indexOf(getDir(i - center(0), i1 - center(1))) - rot + 8) % 8)

        val dist = mod(i - center(0)).max(mod(i1 - center(1)))
        matrix(center(0) + oldIndex._1 * dist)(center(1) + oldIndex._2 * dist)
      } else { matrix(i)(i1) }
    }

    Array.tabulate(matrix.length, matrix.head.length)(tabulate)

  }

}
