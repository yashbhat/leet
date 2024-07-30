package org.hackerank.algorithms.implementation.CatsMouse
import java.io._

object Solution {

    // Complete the catAndMouse function below.
    def catAndMouse(x: Int, y: Int, z: Int): String = {

        (z-y).abs.compare((z-x).abs) match {
            case 0 => "Mouse C"
            case a if a > 0 => "Cat A"
            case _ => "Cat B"
        }
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val q = stdin.readLine.trim.toInt

        for (qItr <- 1 to q) {
            val xyz = stdin.readLine.split(" ")

            val x = xyz(0).trim.toInt

            val y = xyz(1).trim.toInt

            val z = xyz(2).trim.toInt

            val result = catAndMouse(x, y, z)

            printWriter.println(result)
        }

        printWriter.close()
    }
}

object CatsMouse {

}
