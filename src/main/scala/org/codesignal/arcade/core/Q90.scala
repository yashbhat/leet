package org.codesignal.arcade.core

object Q90 {

  def main(args: Array[String]): Unit = {}

  def solution(shoes: Array[Array[Int]]): Boolean = {
    shoes.groupBy(x => x(1)).forall(x => x._2.count(y => y(0) == 0) == x._2.count(y => y(0) == 1))
  }

}
