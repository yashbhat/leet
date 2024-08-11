package org.codesignal.arcade.core

object Q45 {

  def main(args: Array[String]): Unit = {
    println(solution(16))
  }

  def solution(a0: Int): Int = {
    val iter = Iterator.iterate(a0)(x => x.toString.map(_.toString.toInt).map(x => x * x).sum)
    import scala.annotation.tailrec
    @tailrec
    def recur(iterator: Iterator[Int] = iter, seq: Seq[Int] = Seq()): Int = {
      val next = iterator.next()
      if (seq.contains(next)) seq.length + 1
      else recur(iterator, seq.appended(next))
    }
    recur()
  }

}
