package org.hackerank.ds.tree.BinaryTreeHeight

import scala.io.StdIn

object Solution {

  def height(treeNode: BinTreeNode): Int = treeNode match {
    case BinTreeNode(_, None, None)               => 0
    case BinTreeNode(_, Some(value), None)        => height(value) + 1
    case BinTreeNode(_, None, Some(value))        => height(value) + 1
    case BinTreeNode(_, Some(treeL), Some(treeR)) => height(treeL).max(height(treeR)) + 1
  }
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
     */

    val count = StdIn.readInt()
    val data = StdIn.readLine().split(" ").map(_.toInt)
    val tree = data.foldLeft(BinTreeNode())((x, y) => x.add(y))
    println(height(tree))
  }
}

case class BinTreeNode(data: Option[Int] = None, left: Option[BinTreeNode] = None, right: Option[BinTreeNode] = None) {
  def add(dataIn: Int): BinTreeNode = (data, left, right) match {
    case (None, _, _)                      => BinTreeNode(Some(dataIn))
    case (_, None, _) if dataIn < data.get => this.copy(left = Some(BinTreeNode(Some(dataIn))))
    case (_, _, None) if dataIn > data.get => this.copy(right = Some(BinTreeNode(Some(dataIn))))
    case (_, _, _) if dataIn < data.get    => this.copy(left = Some(left.get.add(dataIn)))
    case (_, _, _) if dataIn > data.get    => this.copy(right = Some(right.get.add(dataIn)))
  }
}
object BinaryTreeHeight {}
