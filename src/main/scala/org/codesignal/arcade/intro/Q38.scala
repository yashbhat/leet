package org.codesignal.arcade.intro

object Q38 {
  def main(args: Array[String]): Unit = {}

  def solution(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int = {
    if ( upSpeed> desiredHeight){
      1
    }else if ((desiredHeight - upSpeed) %(upSpeed - downSpeed)==0){
      (desiredHeight - upSpeed) / (upSpeed - downSpeed) + 1}
    else{(desiredHeight - upSpeed) / (upSpeed - downSpeed) + 2}
  }


}
