package org.codesignal.arcade.core

object Q79 {

  def main(args: Array[String]): Unit = {
    println(solution(Array(0, -1, 0, -1, 0, -1)))
    println(solution(Array(-1, 1, -1, 1, -1, 1, -1, 1)))
    println(solution(Array(-1, 0, -1, 0, -1, 0)))
  }

  def solution(a: Array[Int]): Int = {
    val b = a.map(_.toLong)
    val sum = b.sum
    b.tail
      .foldLeft((b.head, 0, 0))({
        case ((d, e, f), y) if d == sum / 3 && d == 2 * sum / 3 => (d + y, e + 1, f + e)
        case ((d, e, f), y) if d == sum / 3                     => (d + y, e + 1, f)
        case ((d, e, f), y) if d == 2 * sum / 3                 => (d + y, e, f + e)
        case ((d, e, f), y)                                     => (d + y, e, f)
      })
      ._3
  }
  def solution3(a: Array[Int]): Int = {
    val sum = a.sum
    val len = a.length
    val stops = a
      .scan(0)(_ + _)
      .tail
      .zipWithIndex
      .foldLeft((Seq[Int](), Seq[Int]()))({
        case ((a, b), (c, d)) if d == len - 1           => (a, b)
        case ((a, b), (c, d)) if c == sum / 3 && c == 0 => (a.appended(d), b.appended(d))

        case ((a, b), (c, d)) if c == sum / 3     => (a.appended(d), b)
        case ((a, b), (c, d)) if c == 2 * sum / 3 => (a, b.appended(d))
        case ((a, b), (c, d))                     => (a, b)

      })
    (for (
      f <- stops._1;
      l <- stops._2;
      y = (f, l) if l > f
    ) yield y).length
  }

  def solution1(a: Array[Int]): Int = {
    val ab = a.map(_.toDouble)
    val sum = ab.sum
    val fStops = ab.scan(0d)(_ + _).tail.zipWithIndex.filter(_._1 == sum / 3).map(_._2)
    val lStops =
      ab.scanRight(0d)(_ + _).tail.zipWithIndex.filter(_._1 == sum / 3).map(_._2).filterNot(_ == ab.length - 1)

    (for (
      f <- fStops;
      l <- lStops;
      y = (f, l) if l > f
    ) yield y).length
  }

  def solution2(a: Array[Int]): Int = {
    (for (
      xt <- a.indices;
      x = xt if a.take(x + 1).sum == a.sum / 3;
      y <- (x + 1 until a.length - 1);
      i = (x, y) if a.drop(y + 1).sum == a.sum / 3
    ) yield i).size
  }
}
