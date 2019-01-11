object RockPaperScissors extends App{
  var memory = Array(0, 0, 0)

  def startMenu() {
    println("Select 1 for Rock, 2 for Paper, 3 for Scissors, or 4 to exit the game.")
    var playChoice = scala.io.StdIn.readInt()
    var options = Array("Rock", "Paper", "Scissors")
    var aiSelect = scala.util.Random.nextInt(2)
    var predictor = 0
    for(i <- 1 until 3){
      if(memory(i) > memory(i-1)){
        predictor = i
      }
    }

    if (predictor == 0) {
      aiSelect = 1
    }
    else if (predictor == 1) {
      aiSelect = 2
    }
    else if (predictor == 2) {
      aiSelect = 0
    }


    playerSelect(playChoice, options)
    println(s"The AI has chosen ${options(aiSelect)}")
    winner(playChoice, aiSelect)
    startMenu()
  }

  def playerSelect(choice:Int, options:Array[String]): Unit ={
    choice match {
      case 1 => memory(0) += 1
      case 2 => memory(1) += 1
      case 3 => memory(2) += 1
      case 4 => sys.exit()
      case _ => println("Invalid choice")
    }
  }

  def winner(playChoice:Int, aiSelect:Int): Unit ={
    if(aiSelect == 0){
      playChoice match{
        case 1 => println("It is a draw")
        case 2 => println("You have won. Congratulations.")
        case 3 => println("You have lost. Commiserations.")
      }
    }
    else if(aiSelect == 1){
      playChoice match{
        case 1 => println("You have lost. Commiserations.")
        case 2 => println("It is a draw")
        case 3 => println("You have won. Congratulations.")
      }
    }
    else{
      playChoice match{
        case 1 => println("You have won. Congratulations.")
        case 2 => println("You have lost. Commiserations.")
        case 3 => println("It is a draw")
      }
    }
  }

  startMenu()
}
