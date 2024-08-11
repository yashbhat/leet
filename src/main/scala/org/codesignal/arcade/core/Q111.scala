package org.codesignal.arcade.core

object Q111 {

  def main(args: Array[String]): Unit = {}

  def solution(rows: Array[String]): Array[Int] = {
    val x = rows
      .map(_.toCharArray)
      .transpose
      .map(x => {
        val index = x.indexOf('#')
        if (index == -1) { 0 }
        else {
          x.drop(index + 1).count(_ == '.')
        }
      })
    val min = x.min
    x.zipWithIndex.filter(_._1 == min).map(_._2)
  }

}
