package org.codesignal.arcade.core

object Q148 {

  def main(args: Array[String]): Unit = {
    println(solution("<table><tr><td>1</td><td>TWO</td></tr><tr><td>three</td><td>FoUr4</td></tr></table>", 0, 1))
  }
  def solution(table: String, row: Int, column: Int): String = {

    val rowRegex = "<tr>([\\d\\w\\s<>/]*?)</tr>".r
    val colRegex = "<td>([\\d\\w\\s<>/]*?)</td>".r


    scala.util
      .Try(
        colRegex
          .findAllIn(rowRegex.findAllIn(table).matchData.map(_.group(1)).toSeq(row))
          .matchData
          .map(_.group(1))
          .toSeq(column)
      )
      .getOrElse("No such cell")

  }

}
