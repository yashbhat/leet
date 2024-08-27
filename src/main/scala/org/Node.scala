package org


case class Node(data: Int, height: Int = 1, left: Option[Node] = None, right: Option[Node] = None) {
  def add(dataIn: Int): Node = (data, left, right) match {
    case (_, None, _) if dataIn < data => this.copy(left = Some(Node(dataIn, this.height + 1)))
    case (_, _, None) if dataIn > data => this.copy(right = Some(Node(dataIn, this.height + 1)))
    case (_, _, _) if dataIn < data    => this.copy(left = Some(left.get.add(dataIn)))
    case (_, _, _) if dataIn > data    => this.copy(right = Some(right.get.add(dataIn)))
  }

}

object Node {
  def main(args: Array[String]): Unit = {
    val data = Seq(4, 2, 3, 1, 5, 6, 7, 8)

    val tree = data.tail.foldLeft(Node(data.head))({ case (tree, elem) =>
      tree.add(elem)
    })

    println(tree)

    val node6 = tree.right.get.right.get
    println(getNodesAtDistance(tree, node6, 2))
    println(getNodesAtDistance(tree, node6, 3))

  }

  private def getNodesAtDistance(tree: Node, node: Node, d: Int): Seq[Node] = {

    def getChildrenAtDistance(n: Node, k: Int): Seq[Node] = {
      k match {
        case 0 => Seq(n)
        case 1 => Seq(n.left, n.right).flatten
        case _ => Seq(n.left, n.right).flatten.flatMap(i => getChildrenAtDistance(i, k - 1))
      }
    }

    def recurseDistanceK(curr: Node = tree, n: Node = node): Seq[Node] = {

      if (curr.data == n.data) {
        getChildrenAtDistance(curr, d)
      } else if (curr.data > n.data) {
        val nodesFromUncles = if (n.height - curr.height == d) { Seq(curr) }
        else if (n.height - curr.height < d) {
          Seq(curr.right).flatten.flatMap(i => getChildrenAtDistance(i, d - (n.height - curr.height) - 1))
        } else { Seq() }
        recurseDistanceK(curr.left.get).appendedAll(nodesFromUncles)
      } else {
        val nodesFromUncles = if (n.height - curr.height == d) { Seq(curr) }
        else if (n.height - curr.height < d) {
          Seq(curr.left).flatten.flatMap(i => getChildrenAtDistance(i, d - (n.height - curr.height) - 1))
        } else { Seq() }
        recurseDistanceK(curr.right.get).appendedAll(nodesFromUncles)
      }
    }

    recurseDistanceK()
  }

}
