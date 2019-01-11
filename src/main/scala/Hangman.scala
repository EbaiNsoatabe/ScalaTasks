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
  var guessStorage = Array.fill(26){""}
  var noOfGuesses = 0
  var incorrect = 0

  def underscores(word:String): Unit ={
    for(i <- 0 until word.length){
      spaces(i) = "_ "
      print(spaces(i))
    }
    println()
  }

  def guess(choice:String): Unit ={
    incorrect = 0
    noOfGuesses += 1
    rightOrWrong(choice)
    letterMatch()
    endOfGame()
  }

  def newGuess(): Unit ={
    println()
    println("Enter your next guess: ")
    letter = scala.io.StdIn.readLine().toLowerCase()
    repeatLetters(letter)
    guess(letter)
  }

  def repeatLetters(guess:String): Unit ={
    guessStorage(noOfGuesses) = guess
    for(i <- 0 until noOfGuesses){
      if(guessStorage(i) == guess){
        println("You have already guessed this letter, try again")
        newGuess()
      }
    }
  }

  def rightOrWrong(choice:String) {
    for (i <- 0 until chosenWord.length) {
      if (choice == chosenWord.substring(i, i + 1)) {
        spaces(i) = s"$choice "
        correctGuesses += 1
      }
      else {
        incorrect += 1
      }
      print(spaces(i))
    }
  }

  def letterMatch() {
    if (correctGuesses == chosenWord.length) {
      println()
      println()
      println(s"Well done, you've guessed ${chosenWord.toUpperCase()} correctly!")
      sys.exit()
    }
    if (incorrect == chosenWord.length) {
      println()
      wrongGuesses += 1
      if (wrongGuesses < 6) {
        println("Incorrect guess, try again.")
      }
      noose(wrongGuesses)
    }
  }

  def endOfGame() {
    if (wrongGuesses < 6) {
      newGuess()
    }
    else {
      println()
      println()
      println(s"You've ran out of guesses. The correct answer was ${chosenWord.toUpperCase()}." +
        s" Goodbye.")
      sys.exit()
    }
  }

  def noose(incorrect:Int): Unit ={
    incorrect match{
      case 1 => println("\n\n\n\n\n\n\n\n_______")
      case 2 => println("\n|\n|\n|\n|\n|\n|\n|\n|_______")
      case 3 => println(" _____\n|\n|\n|\n|\n|\n|\n|\n|_______")
      case 4 => println(" _____\n|     |\n|     O\n|     \n|     \n|     \n|     \n|     \n|_______")
      case 5 => println(" _____\n|     |\n|     O\n|     |\n|     \n|     \n|     \n|     \n|_______")
      case 6 => println(" _____\n|     |\n|     O\n|     |\n|    /\\\n|     \n|     \n|     \n|_______")
    }
  }

  underscores(chosenWord)
  println("Enter your guess: ")
  letter = scala.io.StdIn.readLine().toLowerCase
  repeatLetters(letter)
  guess(letter)
}
