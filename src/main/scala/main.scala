package org.ajay.com

object CountNumbers {
  def main(args: Array[String]): Unit = {
    val limit = 10 // Change this to any number you want to count up to
    for (i <- 1 to limit) {
      println(i)
    }
  }
}
