package org.codesignal.arcade.core

object Q117 {

  def main(args: Array[String]): Unit = {
    println(solution(Array(5, 7, 4, 1, 2), Array(4, 10, 3, 1, 4), Array(6, 5, 5, 1, 2)))
  }

  def solution(length: Array[Int], width: Array[Int], height: Array[Int]): Boolean = {

    val boxes = (for (x <- length.indices) yield Seq(length(x), width(x), height(x)).sorted).sortBy(_.head)

    boxes.tail
      .foldLeft((true, boxes.head))({ case ((a, b), c) =>
        (a && b.zip(c).forall(x => x._1 < x._2), c)
      })
      ._1
  }

}
