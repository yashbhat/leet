package org.codesignal.arcade.intro

object Q49 {
  def main(args: Array[String]): Unit = {}

  def solution(s: String): String = {
    def encode(st: String): String = if (st.length <= 1) st else { s"${st.length}${st.head}" }
    val z = s.foldLeft(("", ""))((x, y) =>
      if (x._1.isEmpty || x._1.head == y) { (x._1 + y, x._2) }
      else { ("" + y, x._2 + encode(x._1)) }
    )
    z._2 + encode(z._1)
  }

}
