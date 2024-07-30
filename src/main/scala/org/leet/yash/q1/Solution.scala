package org.leet.yash.q1

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val indiced = nums.zipWithIndex
    val sortedStruct = indiced.sortBy(_._1)
    var i = 0
    var j = nums.length - 1
    while (i < j && j > 0) {
      if (sortedStruct(j)._1 + sortedStruct(i)._1 > target) {

        j = j - 1
      }
      else if (sortedStruct(j)._1 + sortedStruct(i)._1 < target) {
        i = i + 1
      }
      else {
        return Array(sortedStruct(i)._2, sortedStruct(j)._2)
      }
    }
    return Array(-1, -1)
  }
}
