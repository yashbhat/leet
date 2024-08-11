package org.codesignal.arcade.core

object Q95 {

  def main(args: Array[String]): Unit = {
    println(
      solution(
        Array(321, 487, -601, 246, -623, 447, -313, 987, 444, -455, 606, -370, -678, 422, -623, 513, -617, 500, -58,
          856, -491, -601, -725, -989, -521),
        Array(34, 47, 31, 1, 18, 48, 43, 8, 48, 30, 40, 12, 45, 41, 39, 25, 43, 47, 15, 47, 11, 38, 43, 12, 10)
      )
    )
  }

  def solution(startPosition: Array[Int], speed: Array[Int]): Int = {
    import scala.annotation.tailrec
    @tailrec
    def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a % b)
    }
    def mod(x: Int): Int = if (x > 0) { x }
    else { 0 - x }

    def divide(q: Int, d: Int): (Int, Int) = {
      if (q < 0 || d < 0) { (-1, 1) }
      else if (d == 0) { (-1, 1) }
      else {
        val g = gcd(mod(q), mod(d))
        (mod(q) / g, mod(d) / g)
      }
    }

    def meetingPoint(): Seq[(Int, Int, ((Int, Int), Double))] = {
      for (
        x <- speed.indices;
        y <- x + 1 until speed.length;
        time = divide(startPosition(x) - startPosition(y), speed(y) - speed(x));
        position = startPosition(x).toDouble + speed(x).toDouble * time._1 / time._2 if time._1 > 0;
        z = (x, y, (time, position))
      ) yield z
    }


    meetingPoint().groupBy(_._3).view.mapValues(a => a.flatMap(b => Seq(b._1, b._2)).toSet) match {
      case x if x.isEmpty => -1
      case x              => x.map(_._2.size).max
    }

  }

}
