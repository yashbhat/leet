package org.codesignal.arcade.core

object Q128 {

  def main(args: Array[String]): Unit = {
    println(solution("f3", "f2").mkString("Array(", ", ", ")"))
  }

  def solution(king: String, amazon: String): Array[Int] = {

    val kT = (king.head.toInt - 'a'.toInt, king.tail.toInt - 1)
    val aT = (amazon.head.toInt - 'a'.toInt, amazon.tail.toInt - 1)

    def isCheck(x: Int, y: Int): Boolean = {
      ((x - aT._1).abs == (y - aT._2).abs && !(1 until (x - aT._1).abs).exists(k =>
        (aT._1 + k * ((x - aT._1).abs / (x - aT._1))) == kT._1 && (aT._2 + k * ((y - aT._2).abs / (y - aT._2))) == kT._2
      )) || ((x - aT._1) == 0 && !(kT._1 == x && ((y > kT._2 && kT._2 > aT._2) || (y < kT._2 && kT._2 < aT._2)))) ||
      ((y - aT._2) == 0 && !(kT._2 == y && ((x > kT._1 && kT._1 > aT._1) || (x < kT._1 && kT._1 < aT._1)))) ||
        ((x - aT._1).abs + (y - aT._2).abs == 3 && (x - aT._1).abs.min( (y - aT._2).abs) == 1) || (x - kT._1).abs
        .max((y - kT._2).abs) <= 1
    }
    def canMove(x: Int, y: Int): Boolean = {
      (for (
        i <- Seq(-1, 0, 1).filter(iT => x + iT >= 0 && x +iT<8);
        j <- Seq(-1, 0, 1).filter(jT => y + jT >= 0 && y +jT<8).filterNot(jt => jt == 0 && i == 0);
        p = (i, j)
        if !isCheck(x + i, y + j) || ((x + i, y + j) == aT && (x + i - kT._1).abs.max((y + j - kT._2).abs) > 1)
      ) yield 1).nonEmpty
    }
    def tabulate(x: Int, y: Int): (Int, Int) =
      (x, y) match {
        case t if (t._1 - kT._1).abs.max((t._2 - kT._2).abs) <= 1 => (-1, -1)
        case t if t == aT                                         => (-1, -1)
        case _                                                    => (if (isCheck(x, y)) 1 else 0, if (canMove(x, y)) 1 else 0)
      }

    val kPos = Array.tabulate(8, 8)(tabulate)
    kPos.foreach(x =>
      println(x.toSeq.map({
        case (-1, -1) => " "
        case (1, 0)   => "x"
        case (1, 1)   => "+"
        case (0, 0)   => "*"
        case (0, 1)   => "o"
      }))
    )
    Array(
      kPos.map(_.count(_ == (1, 0))).sum,
      kPos.map(_.count(_ == (1, 1))).sum,
      kPos.map(_.count(_ == (0, 0))).sum,
      kPos.map(_.count(_ == (0, 1))).sum
    )
  }

}
