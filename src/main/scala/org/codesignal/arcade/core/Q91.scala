package org.codesignal.arcade.core

object Q91 {

  def main(args: Array[String]): Unit = {
    println(solution("*..*", "*.*"))
  }

  def solution(comb1: String, comb2: String): Int = {
    def isValidComb2Start(x: Int): Boolean = {
      if (x < 0) {
        val paddedComb1 = "." * (0 - x) + comb1
        !paddedComb1.zip(comb2).contains(('*', '*'))

      } else {
        val paddedComb2 = "." * x + comb2
        !comb1.zip(paddedComb2).contains(('*', '*'))
      }
    }
    def purseLength(x: Int): Int = { comb1.length.max(comb2.length + x) - x.min(0) }
    (-comb2.length to comb1.length).filter(isValidComb2Start).map(purseLength).min
  }

}
