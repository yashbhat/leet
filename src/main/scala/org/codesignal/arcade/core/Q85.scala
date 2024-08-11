package org.codesignal.arcade.core

object Q85 {

  def main(args: Array[String]): Unit = {
    println(solution("1.2.2", "1.2.0"))
  }

  def solution(ver1: String, ver2: String): Boolean = {
    ver1.split('.').zip(ver2.split('.')).foldLeft("")({
      case ("", y) => if (y._1.toInt > y._2.toInt) {
        "1"
      } else if (y._1 == y._2) {
        ""
      } else {
        "2"
      }
      case (x, y) => x
    }) == "1"
  }


}
