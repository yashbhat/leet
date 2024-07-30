package org.hackerank.algorithms.implementation.DesignerPdfView
import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */
    def main(args: Array[String]): Unit = {

        println( designerPdfViewer("1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5".split(" ").map(_.toInt), "abc"))
    }
    def designerPdfViewer(h: Array[Int], word: String): Int = {
        // Write your code here
        (for(x <- h.indices if word.toCharArray.map(_.toInt - 97).contains(x))yield h(x)).max * word.length
        h(word.toCharArray.map(_.toInt - 97).maxBy(x => h(x))) * word.length

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val h = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val word = StdIn.readLine

        val result = Result.designerPdfViewer(h, word)

        printWriter.println(result)

        printWriter.close()
    }
}

object DesignerPdfView {

}
