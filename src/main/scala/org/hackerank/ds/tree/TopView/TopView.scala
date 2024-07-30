package org.hackerank.ds.tree.TopView

import scala.io.StdIn

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
     */

    val count = StdIn.readInt()
    val data = StdIn.readLine().split(" ").map(_.toInt)
    val tree = data.foldLeft(BinTreeNode())((x, y) => x.add(y))
//    println(height(tree))
  }
}

case class BinTreeNode(
    data: Option[Int] = None,
    left: Option[BinTreeNode] = None,
    right: Option[BinTreeNode] = None,
    height: Int = 0,
    width: Int = 0,
    lw: Int = 0,
    rw: Int = 0,
    topView: Seq[Int] = Seq()
) {
  def add(dataIn: Int): BinTreeNode = (data, left, right) match {
    case (None, _, _) => BinTreeNode(Some(dataIn), topView = Seq(dataIn))
    case (_, None, _) if dataIn < data.get =>
      this.copy(left = Some(BinTreeNode(Some(dataIn), height = this.height + 1, width = this.width - 1)))
    case (_, _, None) if dataIn > data.get =>
      this.copy(right = Some(BinTreeNode(Some(dataIn), height = this.height + 1, width = this.width + 1)))
    case (_, _, _) if dataIn < data.get => this.copy(left = Some(left.get.add(dataIn)))
    case (_, _, _) if dataIn > data.get => this.copy(right = Some(right.get.add(dataIn)))
  }
}

object TopView {}
