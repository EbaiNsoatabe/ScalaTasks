object LetterSquare extends App {
  def square(size:Int, letter:String){
    for(i <- 1 to size){
      print(letter)
      if(i == size){
        println()
      }
    }
  }

  println("Enter number: ")
  val number = scala.io.StdIn.readInt()

  println("Enter letter: ")
  val letter = scala.io.StdIn.readLine().toUpperCase

  for(i <- 1 to number){
    square(number, letter)
  }
}

