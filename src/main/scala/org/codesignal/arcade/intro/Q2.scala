package org.codesignal.arcade.intro

class Q2 {
  def solution(year: Int): Int = {
    year/100 + (if(year%100==0){0}else{1})
  }


}
