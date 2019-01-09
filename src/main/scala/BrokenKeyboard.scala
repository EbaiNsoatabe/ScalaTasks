object BrokenKeyboard extends App{
  print("Enter the number of keys that are working on your keyboard: ")
  val noOfKeys = scala.io.StdIn.readInt()
  print("Enter the keys that are working on your keyboard: ")
  val keyboardInput = scala.io.StdIn.readLine()
  val availableLetters = Array.fill(noOfKeys){""}
  for(j <- 0 until noOfKeys){
    availableLetters(j) = keyboardInput.substring(j, j+1)
  }

  def matchCheck(word:String):Boolean={
    var bool = true
    var truths = 0
    for(j <- 0 until availableLetters.length; i <- 0 until word.length){
      if(word.substring(i, i+1) == availableLetters(j)){
        truths += 1
        if(truths == word.length){
          bool = false
        }
      }
    }
    bool
  }

  def possibleWords() {
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
        if(matchCheck(word)){
          lengthCount += word.length
        }
        else{
          if (lengthCount + 1 == word.length) {
            if((word.substring(0, lengthCount + 1).length) > longestWord.length) {
              longestWord = (word.substring(0, lengthCount + 1))
            }
          }
          lengthCount += 1
        }
      }
    }
    println(s"The longest word available with those keys is $longestWord")
  }
  possibleWords()
}