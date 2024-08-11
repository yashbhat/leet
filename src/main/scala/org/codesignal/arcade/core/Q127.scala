package org.codesignal.arcade.core

object Q127 {

  def main(args: Array[String]): Unit = {}

  def solution(n: Int, m: Int): Int = {

    if (n == 1 || m == 1) { 0 }
    else {
      (
        for (
          xR <- 1 to n;
          yR <- 1 to m;
          xB <- Seq(xR - 3, xR - 1, xR, xR + 1, xR + 3).filter(x => x >= 1 && x <= n);
          yB <- Seq(yR - 3, yR - 1, yR, yR + 1, yR + 3)
            .filter(y =>
              y >= 1 && y <= m && (y - yR).abs.min((xB - xR).abs) == 0 && (y - yR).abs.max((xB - xR).abs) != 0
            );

          xK <- Seq(xR - 2, xR - 1, xR + 1, xR + 2).filter(x => x >= 1 && x <= n);
          yK <- Seq(yR - 2, yR - 1, yR + 1, yR + 2)
            .filter(y => y >= 1 && y <= m && (y - yR).abs + (xK - xR).abs == 3 && (y - yB).abs == (xK - xB).abs)
        ) yield 1
      ).size +
      (
        for (
          xR <- 1 to n;
          yR <- 1 to m;
          xK <- Seq(xR - 3, xR - 1, xR, xR + 1, xR + 3).filter(x => x >= 1 && x <= n);
          yK <- Seq(yR - 3, yR - 1, yR, yR + 1, yR + 3)
            .filter(y =>
              y >= 1 && y <= m && (y - yR).abs.min((xK - xR).abs) == 0 && (y - yR).abs.max((xK - xR).abs) != 0
            );
          xB <- Seq(xR - 2, xR - 1, xR + 1, xR + 2).filter(x => x >= 1 && x <= n);
          yB <- Seq(yR - 2, yR - 1, yR + 1, yR + 2).filter(y => y >= 1 && y <= m && (y - yR).abs == (xB - xR).abs && (y - yK).abs + (xK - xB).abs == 3 )
        ) yield 1
      ).size
    }
  }

}
