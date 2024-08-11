package org.codesignal.arcade.core

object Q112 {

  def main(args: Array[String]): Unit = {}
  def solution(evidences: Array[Array[Int]]): Boolean = {
      evidences.transpose.forall(_.filterNot(_==0).distinct.length < 2)
  }


}
