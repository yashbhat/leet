package org.codesignal.arcade.core

object Q133 {

  def main(args: Array[String]): Unit = {}
  def solution(someTime: String, leavingTime: String): String = {
    import  java.time.Instant
    Instant.ofEpochSecond((2* Instant.parse(someTime.appendedAll(":00.000Z").replace(' ', 'T')).getEpochSecond) -
    Instant.parse(leavingTime.appendedAll(":00.000Z").replace(' ', 'T')).getEpochSecond).toString.replace('T',' ').dropRight(4)
  }


}
