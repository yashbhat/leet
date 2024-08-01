package org.codesignal.arcade.intro

object Q58 {
  def main(args: Array[String]): Unit = {}

  def solution(code: String): String =   code.grouped(8).map(Integer.parseInt(_, 2)).map(_.toChar).toSeq.mkString("")

}
