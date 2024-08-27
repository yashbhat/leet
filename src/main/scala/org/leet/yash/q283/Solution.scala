package org.leet.yash.q283

object Solution {
  @annotation.tailrec
  def moveZeroes(nums: Array[Int], to: Int = 0, from: Int = 0): Unit =
    if (from < nums.length) {
      if (nums(to) == 0) {
        if (nums(from) != 0) {
          nums(to) = nums(from)
          nums(from) = 0
          moveZeroes(nums, to + 1, from + 1)
        } else
          moveZeroes(nums, to, from + 1)
      } else
        moveZeroes(nums, to + 1, from + 1)
    }
  def moveZeroes1(nums: Array[Int]): Unit = {
    val a = nums.filter(_ != 0)
    val lena = a.length
    for (x <- nums.indices) {
      if (x < lena) {
        nums.update(x, a(x))
      } else { nums.update(x, 0) }
    }
  }
}
