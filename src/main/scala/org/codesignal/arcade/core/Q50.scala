package org.codesignal.arcade.core

object Q50 {

  def main(args: Array[String]): Unit = {
    println(solution(Array("anaesthetist", "thatch", "ethnics", "sabulous")))
    println(solution(Array("crossword", "square", "formation", "something")))
  }


  def solution(words: Array[String]): Int = {
    def canCrossword(words: Seq[String]): Int =
      (for (
        a1 <- 0 until words(0).length - 2;
        b1T <- 0 until words(1).length - 2;
        b1 = b1T if words(0)(a1) == words(1)(b1T);
        a2 <- a1 + 2 until words(0).length;
        c1T <- 0 until words(2).length - 2;
        c1 = c1T if words(0)(a2) == words(2)(c1T);
        d1 <- 0 until words(3).length - 2;
        b2T <- b1 + 2 until words(1).length;
        b2 = b2T if words(3)(d1) == words(1)(b2T);
        c2 = c1 + (b2 - b1);
        d2 = d1 + (a2 - a1);
        e = (c2, d2) if c2 < words(2).length && d2< words(3).length && words(3)(d2) == words(2)(c2)
      ) yield e).size

    Seq(
      Seq(0, 1, 2, 3),
      Seq(0, 1, 3, 2),
      Seq(0, 2, 1, 3),
      Seq(0, 2, 3, 1),
      Seq(0, 3, 1, 2),
      Seq(0, 3, 2, 1),
      Seq(1, 2, 0, 3),
      Seq(1, 2, 3, 0),
      Seq(1, 3, 0, 2),
      Seq(1, 3, 2, 0),
      Seq(2, 3, 1, 0),
      Seq(2, 3, 0, 1)
    ).map(_.map(words)).map(canCrossword).sum * 2
  }

}
