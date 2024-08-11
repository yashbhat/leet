package org.codesignal.arcade.core

object Q78 {

  def main(args: Array[String]): Unit = {
    println(solution("2#10110#"))
  }

  def solution(line: String): Boolean = {
    import scala.util.Try
    def getBase(line: String): Option[Int] = Try(line.takeWhile(_ != '#').toInt).toOption collect {
      case x if x > 1 && x < 17 => x
    }
    def isBase(line: String, base: Int, digits: Seq[Char] = Seq('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')): Boolean = {
      val parseNumber = line.dropWhile(_!='#').tail.takeWhile(_!='#')
      line.last=='#' && parseNumber.forall(c => digits.take(base).contains(c.toUpper)) && line.count(_=='#')==2 && parseNumber.nonEmpty
    }
    val filteredLine = line.filterNot(_=='_')
    (filteredLine.forall(x => x.isDigit) && filteredLine.length > 1) || (getBase(filteredLine).exists(b => isBase(filteredLine, b)))
  }

}
