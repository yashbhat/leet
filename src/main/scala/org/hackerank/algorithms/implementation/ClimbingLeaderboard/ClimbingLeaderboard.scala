package org.hackerank.algorithms.implementation.ClimbingLeaderboard

import java.io._
import scala.annotation.tailrec
import scala.io._

object Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    def main(args: Array[String]): Unit = {
        println(climbingLeaderboard(Array(100, 100, 50, 40, 40, 20, 10), Array(5, 25, 50, 120)).mkString("Array(", ", ", ")"))
    }

    def climbingLeaderboard2(ranked: Array[Int], player: Array[Int]): Array[Int] = {
        // Write your code here
        @tailrec
        def getRanks(ranked: Array[Int], currRanks: Array[(Int, Int)] = Array()): Array[(Int, Int)] = {
            if (ranked.isEmpty) {
                currRanks
            } else if (currRanks.isEmpty) {
                getRanks(ranked.tail, Array((ranked.head, 1)))
            }
            else if (ranked.head == currRanks.last._1) {
                getRanks(ranked.tail, currRanks)
            } else {
                getRanks(ranked.tail, currRanks.appended((ranked.head, currRanks.last._2 + 1)))
            }
        }

        val ranks = getRanks(ranked).reverse

        @tailrec
        def findRank(ranks: Array[(Int, Int)], playerScore: Array[Int], playerRank: Array[Int]): Array[Int] = {
            if (playerScore.isEmpty) {
                playerRank
            }
            else if (ranks.isEmpty) {
                playerRank.appendedAll(playerScore.map(_ => 1))
            } else {
                ranks.head match {
                    case x if x._1 > playerScore.head => findRank(ranks, playerScore.tail, playerRank.appended(x._2 + 1))
                    case x if x._1 == playerScore.head => findRank(ranks, playerScore.tail, playerRank.appended(x._2))
                    case _ => findRank(ranks.tail, playerScore, playerRank)
                }
            }
        }

        findRank(ranks, player, Array())

    }


    def climbingLeaderboard(ranked: Array[Int], player: Array[Int]): Array[Int] = {
        @tailrec
        def addRank(ranked: Array[Int], rankedOut: Array[(Int, Int)] = Array()): Array[(Int, Int)] = {
            if (ranked.isEmpty) {
                rankedOut
            } else if (rankedOut.isEmpty) {
                addRank(ranked.tail, Array((ranked.head, 1)))
            } else if (ranked.head == rankedOut.head._1) {
                addRank(ranked.tail, rankedOut)
            } else {
                addRank(ranked.tail, Array((ranked.head, rankedOut.head._2 + 1)).appendedAll(rankedOut))
            }
        }

        def compareRank(rank: (Int, Int), playerScore: Int): Int = {
            rank._1 match {
                case x if x == playerScore => rank._2
                case x if x < playerScore => rank._2
                case _ => rank._2 + 1
            }
        }

        @tailrec
        def binSearch(ranks: Array[(Int, Int)], playerScore: Int, begin: Int = 0, end: Int = ranked.length): Int = {
            if (end - begin <= 1) {
                compareRank(ranks(begin), playerScore)
            } else if (end - begin == 2) {

                ranks(begin)._1 match {
                    case x if x == playerScore => ranks(begin)._2
                    case x if x < playerScore => compareRank(ranks(begin + 1), playerScore)
                    case _ => ranks(begin)._2 + 1
                }
            } else {
                ranks((begin + end) / 2)._1 match {
                    case x if x == playerScore => ranks((begin + end) / 2)._2
                    case x if x < playerScore => binSearch(ranks, playerScore, (begin + end) / 2, end)
                    case _ => binSearch(ranks, playerScore, 0, (begin + end) / 2)
                }
            }
        }

        @tailrec
        def findRank(ranks: Array[(Int, Int)], playerScore: Array[Int], playerRank: Array[Int] = Array()): Array[Int] = {
            if (playerScore.isEmpty) {
                playerRank
            }
            else if (ranks.isEmpty) {
                playerRank.appendedAll(playerScore.map(_ => 1))
            } else if (ranks.length == 1) {
                ranks.head._1 match {
                    case x if x == playerScore.head => findRank(ranks, playerScore.tail, playerRank.appended(ranks.head._2))
                    case x if x < playerScore.head => findRank(ranks.tail, playerScore.tail, playerRank.appended(ranks.head._2))
                    case _ => findRank(ranks, playerScore.tail, playerRank.appended(ranks.head._2 + 1))
                }
            } else if (playerScore.length == 1) {

                ranks.head._1 match {
                    case x if x == playerScore.head => playerRank.appended(ranks.head._2)
                    case x if x > playerScore.head => playerRank.appended(ranks.head._2 + 1)
                    case _ => findRank(ranks.tail, playerScore, playerRank)
                }
            }
            else {
                ranks.head match {
                    case x if x._1 > playerScore.head => findRank(ranks, playerScore.tail, playerRank.appended(x._2 + 1))
                    case x if x._1 == playerScore.head => findRank(ranks, playerScore.tail, playerRank.appended(x._2))
                    case _ => {
                        val rank = binSearch(ranks.tail, playerScore.head, 0, ranks.tail.length)
                        findRank(ranks.slice(ranks.length - rank, ranks.length), playerScore.tail, playerRank.appended(rank))
                    }
                }
            }
        }

        findRank(addRank(ranked), player)


    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val rankedCount = StdIn.readLine.trim.toInt

        val ranked = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val playerCount = StdIn.readLine.trim.toInt

        val player = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.climbingLeaderboard(ranked, player)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}

object ClimbingLeaderboard {

}
