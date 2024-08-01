package org.codesignal.arcade.intro

class Q7 {
  def solution(sequence: Array[Int]): Boolean = {

    import scala.annotation.tailrec
    @tailrec
    def isStrictlyIncreasing(sequence: Array[Int]): Boolean = {
      if (sequence.length < 2) { true }
      else if (sequence(1) <= sequence(0)) { false }
      else { isStrictlyIncreasing(sequence.slice(1, sequence.length)) }
    }
    @tailrec
    def isAlmostIncreasing(remSequence: Array[Int], parsedSequence: Array[Int] = Array()): Boolean = {
      if (remSequence.length < 2) { true }
      else if (remSequence(1) <= remSequence(0)) {
        if (parsedSequence.isEmpty) { isStrictlyIncreasing(remSequence.tail) }
        else {
          isStrictlyIncreasing(parsedSequence.last +: remSequence.tail) || isStrictlyIncreasing(
            parsedSequence.last +: (remSequence.head +: remSequence.tail.tail)
          )
        }
      } else { isAlmostIncreasing(remSequence.tail, parsedSequence.appended(remSequence.head)) }
    }

    isAlmostIncreasing(sequence)

  }

}
