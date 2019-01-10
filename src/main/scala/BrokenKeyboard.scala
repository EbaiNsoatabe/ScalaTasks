object BrokenKeyboard extends App{
  var keyboardInput = ""
  var availableLetters = Array.fill(keyboardInput.length) {""}
  println("Enter the number of configurations you want to check: ")
  val configurations = scala.io.StdIn.readInt()
  var recur = 1
  var repetition = ""
  var repeatingKeys = 1

  def menu() {
    if(recur <= configurations) {
      println("Enter the keys that are working on your keyboard: ")
      keyboardInput = scala.io.StdIn.readLine()
      repeat(keyboardInput)
      availableLetters = Array.fill(keyboardInput.length) {""}

      for (j <- 0 until keyboardInput.length) {
        availableLetters(j) = keyboardInput.substring(j, j + 1)
      }

      possibleWords(keyboardInput)
      recur += 1
      menu()
    }
    else{
      println("Have a good day.")
      sys.exit()
    }
  }

  def repeat(letterEntry:String){
    repetition = letterEntry.substring(0, 1)
    repeatingKeys = 1
    while(repeatingKeys < letterEntry.length){
      if(letterEntry.substring(repeatingKeys, repeatingKeys + 1) == repetition) {
        println("Please enter each key only once")
        println()
        menu()
      }
      else{
        repeatingKeys += 1
      }
    }
  }

  def matchCheck(word:String, letters:String):Boolean={
    var bool = true
    var truths = 0
    for(j <- 0 until letters.length; i <- 0 until word.length){
      if(word.substring(i, i+1) == letters.substring(j, j+1)){
        truths += 1
        if(truths == word.length){
          bool = false
        }
      }
    }
    bool
  }

  def possibleWords(letters:String) {
    import scala.io.Source
    val fileName = "C:\\Users\\Admin\\scala\\exercises\\words.txt"
    val availableWords = Source.fromFile(fileName).getLines.toArray
    var word = ""
    var lengthCount = 0
    var longestWord = ""
    for (i <- 0 until availableWords.length) {
      word = availableWords(i)
      lengthCount = 0
      while (lengthCount < word.length) {
        if(matchCheck(word, letters)){
          lengthCount += word.length
        }
        else{
          if (lengthCount + 1 == word.length) {
            if(word.substring(0, lengthCount + 1).length > longestWord.length) {
              longestWord = word.substring(0, lengthCount + 1)
            }
          }
          lengthCount += 1
        }
      }
    }
    if(longestWord.length >= 1) {
      println(s"The longest word available with those keys is $longestWord")
    }
    else{
      println(s"There are no words available with these keys. Sorry.")
    }
    println()
  }

  menu()
}