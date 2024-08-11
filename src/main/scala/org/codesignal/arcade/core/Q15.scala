package org.codesignal.arcade.core

object Q15 {
  def main(args: Array[String]): Unit = {}

  def solution(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean = {
    (young && beautiful && !loved) || (loved && !(young && beautiful))
  }

}
