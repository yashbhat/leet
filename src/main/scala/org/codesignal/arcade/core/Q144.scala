package org.codesignal.arcade.core

object Q144 {

  def main(args: Array[String]): Unit = {
  }

  def solution(code: String, args: Array[String]): String = {
    val argumentVariants = args.mkString("|")
    val pattern = ("([^a-zA-Z0-9_$])" + s"($argumentVariants)(?=[^a-zA-Z0-9_])").r
    val sub = "$1\\$$2"
    return pattern.replaceAllIn(code, sub)
  }



}
