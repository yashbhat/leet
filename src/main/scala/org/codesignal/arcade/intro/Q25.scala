package org.codesignal.arcade.intro

object Q25 {
  def main(args: Array[String]): Unit = {}

  def solution(inputArray: Array[Int], elemToReplace: Int, substitutionElem: Int): Array[Int] = {
    inputArray.map(x =>
      if (x == elemToReplace) { substitutionElem }
      else { x }
    )
  }

}
