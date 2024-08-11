package org.codesignal.arcade.core

object Q99 {

  def main(args: Array[String]): Unit = {
  }

  def solution(array1: Array[Array[Int]], array2: Array[Array[Int]]): Boolean = {
array1.length==array2.length && array1.zip(array2).forall(a => a._1.length==a._2.length)
  }



}
