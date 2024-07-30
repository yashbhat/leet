package org.codesignal

object Q22 {
  def main(args: Array[String]): Unit = {}

  def solution(inputString: String): Boolean = {
    def convertToIpv4(ip: String): Option[String] = {
      val parts = ip.split("\\.")
      if (parts.length != 4) return None
      for (part <- parts) {
        if (
          scala.util
            .Try(part.toInt)
            .isFailure || part.isEmpty || part.length > 3 || part.toInt < 0 || part.toInt > 255 || (part.length > 1 && part(
            0
          ) == '0')
        ) return None
      }
      Some(ip)
    }

    convertToIpv4(inputString).isDefined
  }

}
