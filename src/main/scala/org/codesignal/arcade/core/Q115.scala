package org.codesignal.arcade.core

object Q115 {

  def main(args: Array[String]): Unit = {}

  def solution(a: Array[Int]): Array[Int] = {
    import scala.annotation.tailrec
    @tailrec
    def arrange(b: Array[Int] = a, c: Array[Int] = a.filterNot(_ < 0).sorted, d: Array[Int] = Array()): Array[Int] = {
      if (c.isEmpty){
        d ++ b
      }else if(b.isEmpty){
        d ++ c
      }else if(b.head<0){
        arrange(b.tail, c, d.appended(b.head))
      }else{
        arrange(b.tail, c.tail, d.appended(c.head))
      }

    }
    arrange()
  }


}
