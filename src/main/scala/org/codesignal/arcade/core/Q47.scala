package org.codesignal.arcade.core

object Q47 {

  def main(args: Array[String]): Unit = {}
  def solution(l: Int, r: Int): Int = {

    def s(x: Int): Int = x.toString.map(_.toString.toInt).sum
    def isComfortable(x: Int, y: Int): Boolean = {
      (y >= x - s(x)) && (y <= x + s(x))
    }
    val comforted =
      for (
        a <- l until r;
        b <- a + 1 to r;
        c = (a, b) if isComfortable(a, b) && isComfortable(b, a)
      ) yield c
    comforted.size
  }

}
