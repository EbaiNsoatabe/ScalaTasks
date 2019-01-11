object RockPaperScissors extends App{
  println("Select 1 for Rock, 2 for Paper, or 3 for Scissors")
  val playChoice = scala.io.StdIn.readInt()
  val options = Array("Rock", "Paper", "Scissors")
  val aiSelect = scala.util.Random.nextInt(2)

  def playerSelect(choice:Int): Unit ={
    choice match {
      case 1 => println(s"You have chosen ${options(0)}")
      case 2 => println(s"You have chosen ${options(1)}")
      case 3 => println(s"You have chosen ${options(2)}")
      case _ => println("Invalid choice")
    }
  }

  def winner(): Unit ={
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
  playerSelect(playChoice)
  println(s"The AI has chosen ${options(aiSelect)}")
  winner()
}
