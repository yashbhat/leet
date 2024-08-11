package org.codesignal.arcade.core

object Q87 {

  def main(args: Array[String]): Unit = {}

  def solution(s1: String, s2: String): Boolean = {
    def tokenizer(s: String): Array[String] =
      s.foldLeft(Array[String]())((a, b) =>
        (a, b) match {
          case (x, y) if x.isEmpty                        => Array(s"$y")
          case (x, y) if y.isDigit && x.head.head.isDigit => x.head.appended(y) +: x.tail
          case (x, y)                                     => s"$y" +: x
        }
      ).reverse

    import scala.annotation.tailrec
    @tailrec
    def compareNum(a: String, b: String): Int = {
      if (a.length < b.length) { -1 }
      else if (a.length > b.length) { 1 }
      else if (a.isEmpty) { 0 }
      else if (a.head < b.head) { -1 }
      else if (a.head > b.head) { 1 }
      else { compareNum(a.tail, b.tail) }
    }

    @tailrec
    def stripZero(a: String): String = {
      if (a.isEmpty) { "0" }
      else if (a.head != '0') { a }
      else { stripZero(a.tail) }
    }
    def compare(a: String, b: String): Int = (a.head.isDigit, b.head.isDigit) match {
      case (true, true)  => compareNum(stripZero(a), stripZero(b))
      case (true, false) => -1
      case (false, true) => 1
      case (false, false) =>
        if (a < b) {
          -1
        } else if (a > b) {
          1
        } else {
          0
        }
    }
    @tailrec
    def compareArr(a: Array[String] = tokenizer(s1), b: Array[String] = tokenizer(s2)): Int = {
      if (a.isEmpty && b.nonEmpty) {
        -1
      } else if (a.nonEmpty && b.isEmpty) {
        1
      } else if (a.isEmpty && b.isEmpty) {
        0
      } else {
        compare(a.head, b.head) match {
          case -1 => -1
          case 1  => 1
          case 0  => compareArr(a.tail, b.tail)
        }
      }
    }

    @tailrec
    def compare0(a: Array[String] = tokenizer(s1), b: Array[String] = tokenizer(s2)): Boolean = {
      if (a.isEmpty && b.isEmpty) {
        false
      } else if (a.head != b.head) {
        a.head.length > b.head.length
      } else { compare0(a.tail, b.tail) }
    }

    if (s1 == s2) { false }
    else {
      compareArr() match {
        case -1 => true
        case 1  => false
        case 0  => compare0()
      }
    }
  }

}
