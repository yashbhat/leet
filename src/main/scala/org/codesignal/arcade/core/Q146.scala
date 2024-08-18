package org.codesignal.arcade.core

object Q146 {

  def main(args: Array[String]): Unit = {
    println(solution("Roll d6-3 and 4d4+3 to pick a weapon, and finish the boss with 3d7!"))
  }

  def solution(rules: String): Int = {
    val pattern = "(\\d*)[d](\\d+)([+-]\\d+)*".r
    val formulas = pattern.findAllIn(rules).matchData

    var res = 0
    for (formula <- formulas) {
      val rolls = if (formula.group(1).nonEmpty) formula.group(1).toInt else 1
      val dieType = formula.group(2).toInt
      var formulaMax = rolls * dieType

      if (formula.group(3) != null && formula.group(3).nonEmpty) {
        if (formula.group(3)(0) == '-') {
          formulaMax -= formula.group(3).substring(1).toInt
        } else {
          formulaMax += formula.group(3).substring(1).toInt
        }
      }
      res += formulaMax
    }

    return res
  }



}
