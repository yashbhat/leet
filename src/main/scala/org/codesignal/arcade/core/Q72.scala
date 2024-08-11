package org.codesignal.arcade.core

object Q72 {

  def main(args: Array[String]): Unit = {
  }
  def solution(picture: Array[String]): Array[String] = {
    val border = "*" * (picture(0).length + 2)
    border +: picture.map("*" + _ + "*") :+ border
  }


}
