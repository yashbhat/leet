package org.codesignal.arcade.core

object Q68 {

  def main(args: Array[String]): Unit = {
  }

  def solution(inputArray: Array[String]): Array[String] = {
val max = inputArray.maxBy(_.length).length
    inputArray.filter(_.length==max)
  }



}
