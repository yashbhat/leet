package org.codesignal.arcade.core

object Q121 {

  def main(args: Array[String]): Unit = {}

  def solution(a: Array[Int]): Int = {
    def product(i: Int): Int = {
      i.toString.toCharArray.map(_.toString.toInt).product
    }
    a.map(product).distinct.length
  }



}
