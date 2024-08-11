package org.codesignal.arcade.core

object Q66 {

  def main(args: Array[String]): Unit = {
    solution(Array(1, 3), 10)
  }

  def solution(divisors: Array[Int], k: Int): Int = {

    def isFriends(a: Int, b: Int): Boolean =
      divisors.forall(x => (a % x == 0 && b % x == 0) || (a % x != 0 && b % x != 0))

    import scala.annotation.tailrec
    @tailrec
    def makeClans(nums: Seq[Int] = (1 to k), clans: Seq[Seq[Int]] = Seq()): Int = {
      if (nums.isEmpty) {
        clans.size
      } else {
        (nums.tail.find(x => isFriends(nums.head, x)), clans.indexWhere(_.contains(nums.head))) match {
          case (Some(value), index) if index > -1 =>
            makeClans(nums.tail, clans.updated(index, clans(index).appended(value)))
          case (Some(value), _)            => makeClans(nums.tail, clans.appended(Seq(nums.head, value)))
          case (None, index) if index > -1 => makeClans(nums.tail, clans)
          case (None, _)                   => makeClans(nums.tail, clans.appended(Seq(nums.head)))
        }
      }
    }
    makeClans()
  }

}
