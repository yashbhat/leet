package org.codesignal.arcade.core

object Q86 {

  def main(args: Array[String]): Unit = {
  }

  def solution(cipher: String): String = {
    cipher.foldLeft(("", ""))((a,b) => (a._2, a._1.appended(b).toInt - 'a'.toInt) match {
      case (x, y) if  y>=0 && y<26  => ("", a._2.appended(a._1.appended(b).toInt.toChar))
      case _ => (a._1.appended(b), a._2)
    })._2
  }



}
