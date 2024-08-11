package org.codesignal.arcade.core

object Q32 {
  def main(args: Array[String]): Unit = {
    println(solution(1445))
  println(solution(15))}

  def solution(n: Int): Int = {

    import scala.annotation.tailrec
    @tailrec
    def round(a: Int = n, c: Int = 1): Int = {
      if (a < 10) { a * c }
      else {
        round(a / 10 + (a % 10 >= 5).compareTo(false), c * 10)
      }
    }
    round()
  }

}
