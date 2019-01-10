object Hangman extends App{
  import scala.io.Source

  val fileName = "C:\\Users\\Admin\\scala\\exercises\\words.txt"
  val availableWords = Source.fromFile(fileName).getLines.toArray
  val wordPosition = scala.util.Random.nextInt(availableWords.length)
  val chosenWord = availableWords(wordPosition)
  var spaces = Array.fill(chosenWord.length){""}
  var letter = ""
  var wrongGuesses = 0
  var correctGuesses = 0

  def underscores(word:String): Unit ={
    for(i <- 0 until word.length){
     spaces(i) = "_ "
     print(spaces(i))
    }
    println()
  }

  def guess(choice:String): Unit ={
    var incorrect = 0
    for(i <- 0 until chosenWord.length){
      if(choice == chosenWord.substring(i, i+1)){
        spaces(i) = s"$choice "
        correctGuesses += 1
      }
      else{
        incorrect += 1
      }
      print(spaces(i))
    }
    if(correctGuesses == chosenWord.length){
      println()
      println()
      println(s"Well done, you've guessed ${chosenWord.toUpperCase()} correctly!")
      sys.exit()
    }
    if(incorrect == chosenWord.length){
      println()
      println("Incorrect guess, try again.")
      wrongGuesses += 1
    }
    if(wrongGuesses < 10){
      newGuess()
    }
    else{
      println()
      println()
      println(s"You've ran out of guesses. The correct answer was ${chosenWord.toUpperCase()}." +
        s" Goodbye.")
    }
  }

  def newGuess(): Unit ={
    println()
    println("Enter your next guess: ")
    letter = scala.io.StdIn.readLine().toLowerCase()
    guess(letter)
  }

  underscores(chosenWord)
  println("Enter your guess: ")
  letter = scala.io.StdIn.readLine().toLowerCase
  guess(letter)
}
