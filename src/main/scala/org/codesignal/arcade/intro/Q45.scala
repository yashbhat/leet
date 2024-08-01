package org.codesignal.arcade.intro

object Q45 {
  def main(args: Array[String]): Unit = {}

  def solution(st: String): String = {
    def isPalindrome(s: String): Boolean = s == s.reverse

    (for (
      x <- st.indices;

      y = st.slice(x, st.length)
    ) yield y)
      .find(isPalindrome)
      .map(s => st + st.take( st.length - s.length).reverse)
      .getOrElse(st + st.reverse)

  }

}
