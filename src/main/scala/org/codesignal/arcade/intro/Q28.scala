package org.codesignal.arcade.intro

object Q28 {
  def main(args: Array[String]): Unit = {}

  def solution(inputString: String): String = {
inputString.map {
  case 'z' => 'a'
  case x => (x.toInt + 1).toChar
}
  }



}
