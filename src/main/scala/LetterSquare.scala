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
  var number = scala.io.StdIn.readInt()

  println("Enter letter: ")
  var letter = scala.io.StdIn.readLine()
  letter = letter.toUpperCase

  for(i <- 1 to number){
    square(number, letter)
  }
}

