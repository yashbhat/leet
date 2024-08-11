package org.codesignal.arcade.core

object Q125 {

  def main(args: Array[String]): Unit = {}


  def solution(p: String): Boolean = {
    p.split(';').map(x => x(0).toInt + x.tail.toInt).sum % 2 == 0
  }

}
