package org.codesignal.arcade.core

object Q141 {

  def main(args: Array[String]): Unit = {}

  def solution(s: String, n: Int): String = {
    val pattern = (s"\\D*(?:\\d+\\D+){${n-1}}0*(\\d+)").r

    return pattern.findFirstMatchIn(s).map(_ group 1).get
  }

}
