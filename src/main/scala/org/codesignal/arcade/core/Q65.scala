package org.codesignal.arcade.core

object Q65 {

  def main(args: Array[String]): Unit = {}

  def solution(n: Int): Int = {
    def s(x: Int): Int = x.toString.map(_.toString.toInt).sum
    def step(x: Int): Int = x - s(x)

    val steps= Iterator.iterate(n)(step).takeWhile(_!=0)
    val ss = steps.map(s)
    val ssCountMap = ss.toSeq.groupBy(identity).view.mapValues(_.length)
    val maxVal = ssCountMap.maxBy(_._2)._2
    val maxKey = ssCountMap.filter(_._2 == maxVal).maxBy(_._1)._1
    maxKey
  }

}
