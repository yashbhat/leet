package org.codesignal.arcade.core

object Q16 {
  def main(args: Array[String]): Unit = {}

  def solution(lastNumberOfDays: Int): Array[Int] = {
lastNumberOfDays match {
  case 31 => Array(28,30,31)
  case _ => Array(31)// 28 or 30
}
  }


}
