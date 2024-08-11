package org.codesignal.arcade.core

object Q96 {

  def main(args: Array[String]): Unit = {
    println(solution(1, 3).mkString("Array(", ", ", ")"))
    println(solution(2, 4).mkString("Array(", ", ", ")"))
  }
  def solution(levelNum: Int, levelHeight: Int): Array[String] = {
    val asymmetricTree = Array("*", "*", "***")
      .appendedAll(
        (1 to levelNum).toArray.flatMap(x => (1 to levelHeight).toArray.map(y => "*" * (1 + x * 2 + y * 2)))
      )
      .appendedAll((1 to levelNum).toArray.map(_ => "*" * ((levelHeight / 2) * 2 + 1)))

    val max = asymmetricTree.map(_.length).max
    asymmetricTree.map(x => " "*(max/2 - x.length/2) + x)

  }

}
