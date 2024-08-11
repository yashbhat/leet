package org.codesignal.arcade.core

object Q58 {

  def main(args: Array[String]): Unit = {
  }

  def solution(filename1: String, filename2: String): Boolean = {
    (filename1.compareTo(filename2)>0)!= (filename1.compareToIgnoreCase(filename2)>0)
  }



}
