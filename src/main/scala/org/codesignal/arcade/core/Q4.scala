package org.codesignal.arcade.core

object Q4 {
  def main(args: Array[String]): Unit = {

  }

  def solution(nCols: Int, nRows: Int, col: Int, row: Int): Int = {
    (nRows - row)*(nCols - col +1)
  }



}
