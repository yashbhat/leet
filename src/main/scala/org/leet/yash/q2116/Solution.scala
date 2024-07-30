package org.leet.yash.q2116

import scala.annotation.tailrec

object Solution {

    @tailrec
    private def validRecurse(zip: Array[(Int, Char, Char)], index: Int = 0, open: Int = 0): Boolean = {
        if (index == zip.length) {
            open == 0
        } else {
            val curr = zip(index)
            curr match {
                case (_, '(', _) => validRecurse(zip, index + 1, open + 1)
                case (_, _, '1') => if (open <= 0) {
                    false
                } else {
                    validRecurse(zip, index + 1, open - 1)
                }
                case (x, _, _) => val b = zip.slice(x, zip.length).find(a => a._3 == '0' && a._2 == '(')
                    if(b.nonEmpty){
                    validRecurse(zip.updated(b.get._1, curr), index + 1, open + 1)
                }else{false}
            }
        }
    }

    def canBeValid(s: String, locked: String): Boolean = {
        s.toCharArray.zip(locked.toCharArray)
        if (s.count(_ == '(') == s.count(_ == ')')) {

            val zip = s.toCharArray.zip(locked.toCharArray).zipWithIndex.map(x => (x._2, x._1._1, x._1._2))

            validRecurse(zip)
        }
        else {
            false
        }
    }
}
