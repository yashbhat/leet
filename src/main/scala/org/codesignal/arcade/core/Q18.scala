package org.codesignal.arcade.core

object Q18 {
  def main(args: Array[String]): Unit = {}

  def solution(a: Array[Int]): Int = {
    a.zip(Array(1, 256, 256*256, 256*256*256)).map({case (a,b) => a*b}).sum
  }
  def solution2(a: Array[Int]): Int = {
    Integer.parseInt(a.map(i =>("00000000"+ s"${i.toBinaryString}").takeRight(8)).reverse.reduce(_ + _),2)
  }



}
