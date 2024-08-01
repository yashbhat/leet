package org.codesignal.arcade.intro

object Q42 {
  def main(args: Array[String]): Unit = {}
  def solution(bishop: String, pawn: String): Boolean = {
    (pawn(0).toInt - bishop(0).toInt).abs==(pawn.tail.toInt-bishop.tail.toInt).abs
  }



}
