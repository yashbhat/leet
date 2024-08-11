package org.codesignal.arcade.core

object Q113 {

  def main(args: Array[String]): Unit = {}

  def solution(size: Int, nonogramField: Array[Array[String]]): Boolean = {

    def isValid(s: Array[String]): Boolean = {
      val numbers = s.take((size + 1) / 2).dropWhile(_=="-")
      val towers = s.drop((size + 1) / 2).dropWhile(_==".").mkString("").split('.').filterNot(_.isEmpty)
      numbers.length == towers.length && numbers.zip(towers).forall(x => x._2.length == x._1.toInt)
    }
    nonogramField.drop((size + 1) / 2).forall(isValid) && nonogramField.transpose.drop((size + 1) / 2).forall(isValid)
  }

}
