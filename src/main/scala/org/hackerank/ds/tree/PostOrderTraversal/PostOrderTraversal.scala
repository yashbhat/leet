package org.hackerank.ds.tree.PostOrderTraversal

import scala.io.StdIn

object Solution {

  private def postOrderTraversal(treeNode: BinTreeNode, curr: Seq[String] = Seq()): Seq[String] =
    treeNode match {
      case BinTreeNode(None, _, _)                    => curr
      case BinTreeNode(Some(value), None, None)       => value.toString +:curr
      case BinTreeNode(Some(value), Some(tree), None) => postOrderTraversal(tree, value.toString +:curr)
      case BinTreeNode(Some(value), None, Some(tree)) => postOrderTraversal(tree, value.toString +:curr)
      case BinTreeNode(Some(value), Some(treeL), Some(treeR)) =>
        postOrderTraversal(treeL, postOrderTraversal(treeR, value.toString +:curr))
    }
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
     */

    val count = StdIn.readInt()
    val data = StdIn.readLine().split(" ").map(_.toInt)
    val tree = data.foldLeft(BinTreeNode())((x, y) => x.add(y))
    println(postOrderTraversal(tree).mkString(" "))

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

object PostOrderTraversal {}
