package org.codesignal.arcade.core

object Q8 {
  def main(args: Array[String]): Unit = {

  }

  def solution(min1: Int, min2_10: Int, min11: Int, s: Int): Int = {
    if(s< min1){0}else if((s- min1) < min2_10*9){
1 + (s-min1)/min2_10
    }else{
1 + 9 + (s -min1 -min2_10*9)/min11
    }
  }



}
