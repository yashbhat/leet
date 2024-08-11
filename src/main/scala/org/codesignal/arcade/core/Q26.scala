package org.codesignal.arcade.core

object Q26 {
  def main(args: Array[String]): Unit = {
  }

  def solution(n: Int, l: Int, r: Int): Int = {
    if (n < 2 * l || n > 2 * r) { 0 }
    else { (l to r).count(a => (n - a) >= a && r >= (n - a)) }
  }

  def solution2(n: Int, l: Int, r: Int): Int = {
    (l to r).dropWhile(a => r < n - a).takeWhile(a => (n - a) >= a && r >= (n - a)).length
  }
}
