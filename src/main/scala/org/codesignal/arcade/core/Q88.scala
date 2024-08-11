package org.codesignal.arcade.core

object Q88 {

  def main(args: Array[String]): Unit = {}
  def solution(inputArray: Array[Int]): Int = {
    val length = inputArray.length
    if (length == 1) { inputArray.head }
    else {
      val iter = (1 to 7).filter(k => math.pow(2, k).toInt == length).head
      (1 to iter)
        .foldLeft(inputArray)({
          case (x, y) if y % 2 == 0 => x.grouped(2).map(e => e(0) * e(1)).toArray
          case (x, y)               => x.grouped(2).map(e => e(0) + e(1)).toArray
        })
        .head
    }
  }

}
