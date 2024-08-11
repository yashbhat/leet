package org.codesignal.arcade.core

object Q59 {

  def main(args: Array[String]): Unit = {
  }

  def solution(a: String, b: String): Int = {
    val bmap = b.groupBy(identity).view.mapValues(_.length)
    a.groupBy(identity).view.mapValues(_.length).map({
      case (c, i) => bmap.getOrElse(c, 0)/i
    }).min
  }



}
