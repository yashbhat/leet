package org.codesignal.arcade.core

object Q122 {

  def main(args: Array[String]): Unit = {}

  def solution(bishop: String, pawn: String): Boolean = {
    (pawn(0).toInt - bishop(0).toInt).abs==(pawn.tail.toInt-bishop.tail.toInt).abs

  }



}
