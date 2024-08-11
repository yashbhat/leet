package org.codesignal.arcade.core

object Q53 {

  def main(args: Array[String]): Unit = {
  }

  def solution(inputString: String): Boolean = {
    val len = inputString.length
len%2==0 && inputString.take(len/2)==inputString.drop(len/2)
  }




}
