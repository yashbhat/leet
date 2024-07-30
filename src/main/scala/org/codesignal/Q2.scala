package org.codesignal

class Q2 {
  def solution(year: Int): Int = {
    year/100 + (if(year%100==0){0}else{1})
  }


}
