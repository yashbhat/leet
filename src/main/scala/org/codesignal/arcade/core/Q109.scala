package org.codesignal.arcade.core

object Q109 {

  def main(args: Array[String]): Unit = {
    solution(Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9), Array(10, 11, 12))).foreach(x =>
      println(x.mkString(", "))
    )
    solution(Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10), Array(11, 12, 13, 14, 15))).foreach(x =>
      println(x.mkString(", "))
    )
  }

  def solution(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    def tabulate(x: Int, y: Int): Int = {
      val lead = x.min(y).min(matrix.length - 1 - x).min(matrix.head.length - 1 - y)

      val height = matrix.length - lead - lead
      val width = matrix.head.length - lead - lead
      if (height == 1 && width == 1) { matrix(x)(y) }
      else if (height == 1) { matrix(x)((y - lead - ((lead % 2) * 2 - 1) * (-1) + width) % width + lead) }
      else if (width == 1) { matrix((x - lead - ((lead % 2) * 2 - 1) * (-1) + height) % height + lead)(y) }
      else if (lead % 2 == 0) {
        (x, y) match {
          case (a, b) if a == lead && b == lead                                              => matrix(a + 1)(b)
          case (a, b) if a == matrix.length - 1 - lead && b == lead                          => matrix(a)(b + 1)
          case (a, b) if a == lead && b == matrix.head.length - 1 - lead                     => matrix(a)(b - 1)
          case (a, b) if a == matrix.length - 1 - lead && b == matrix.head.length - 1 - lead => matrix(a - 1)(b)
          case (a, b) if a == lead                                                           => matrix(a)(b - 1)
          case (a, b) if a == matrix.length - 1 - lead                                       => matrix(a)(b + 1)
          case (a, b) if b == lead                                                           => matrix(a + 1)(b)
          case (a, b) if b == matrix.head.length - 1 - lead                                  => matrix(a - 1)(b)
        }
      } else {
        (x, y) match {
          case (a, b) if a == lead && b == lead                                              => matrix(a)(b + 1)
          case (a, b) if a == matrix.length - 1 - lead && b == lead                          => matrix(a - 1)(b)
          case (a, b) if a == lead && b == matrix.head.length - 1 - lead                     => matrix(a + 1)(b)
          case (a, b) if a == matrix.length - 1 - lead && b == matrix.head.length - 1 - lead => matrix(a)(b - 1)
          case (a, b) if a == lead                                                           => matrix(a)(b + 1)
          case (a, b) if a == matrix.length - 1 - lead                                       => matrix(a)(b - 1)
          case (a, b) if b == lead                                                           => matrix(a - 1)(b)
          case (a, b) if b == matrix.head.length - 1 - lead                                  => matrix(a + 1)(b)
        }
      }

    }
    Array.tabulate(matrix.length, matrix.head.length)(tabulate)
  }

}
