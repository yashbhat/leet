package org.codesignal.arcade.core

object Q118 {

  def main(args: Array[String]): Unit = {
  }

  def solution(a: Array[Int], q: Array[Array[Int]]): Int = {
      val s = q.foldLeft(Seq.fill(a.length)(0))((x, y) => (y(0) to y(1)).foldLeft(x)((a, b) => a.updated(b, a(b) + 1)))

      s.sorted.zip(a.sorted).map(x => x._1*x._2).sum

  }


}
