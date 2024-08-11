package org.codesignal.arcade.core

object Q52 {

  def main(args: Array[String]): Unit = {
  }

  def solution(noun: String): String = {
noun.head.toUpper +: noun.tail.map(_.toLower)
  }



}
