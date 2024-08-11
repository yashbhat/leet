package org.codesignal.arcade.core

object Q36 {
  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[Int], elemToReplace: Int, substitutionElem: Int): Array[Int] = {
    inputArray.map(x =>
      if (x == elemToReplace) { substitutionElem }
      else { x }
    )
  }



}
