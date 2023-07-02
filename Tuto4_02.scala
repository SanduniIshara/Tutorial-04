object Tuto4_02 {
  def main(args: Array[String]): Unit = {
       println("Give a number :");
        var num=scala.io.StdIn.readInt();
    def patternMatching(num:Int):Unit= num match {
      case num if num <= 0 => println("Negative/Zero is input")
      case num if num % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")

    }
    patternMatching(num);
  }
}
