package org.hackerank.algorithms.implementation.DayOfProgrammer

import java.io._
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import scala.io._

object Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */
    def main(args: Array[String]): Unit = {
        println(dayOfProgrammer(2016))
        println(dayOfProgrammer(1918))
    }
    def dayOfProgrammer(year: Int): String = {
        // Write your code here
        year match {
            case x if x == 1918 => LocalDate.parse(s"$x-01-01").plusDays(255+13).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            case x if x < 1918 && x %100==0 && x%400!=0 => LocalDate.parse(s"$x-01-01").plusDays(254).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            case x  => LocalDate.parse(s"$x-01-01").plusDays(255).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        }
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val year = StdIn.readLine.trim.toInt

        val result = Result.dayOfProgrammer(year)

        printWriter.println(result)

        printWriter.close()
    }
}

object DayOfProgrammer {

}
