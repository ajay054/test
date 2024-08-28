package org.ajay.com

object WordCount {
  def main(args: Array[String]): Unit = {
    val text = "This is a simple word count program in Scala." // Input text
    val wordCount = countWords(text)
    println(s"Number of words: $wordCount")
  }

  def countWords(text: String): Int = {
    text.split("\\s+").length // Split the string by whitespace and count the words
  }
}