package org.codesignal.arcade.core

object Q130 {

  def main(args: Array[String]): Unit = {}

  def solution(time: String): Boolean = {
    val x = time.split(':')
    x(0).toInt < 24 && x(1).toInt< 60
  }


}
