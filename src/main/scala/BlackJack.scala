object BlackJack extends App{
  def twentyOne(cardOne:Int, cardTwo:Int): Unit ={
    if(21 - cardOne < 21 - cardTwo){
      print(cardOne)
    }
    else{
      print(cardTwo)
    }
  }

  def bust(cardOne:Int, cardTwo:Int) {
    if(cardOne > 21 && cardTwo <= 21) {
      print(cardTwo)
    }
    else if(cardTwo > 21 && cardOne <= 21){
      print(cardOne)
    }
    else{
      print(0)
    }
  }

  print("Enter value of first card: ")
  val firstCard = scala.io.StdIn.readInt()
  print("Enter value of second card: ")
  val secondCard = scala.io.StdIn.readInt()

  print(s"The winning card value is ")

  if(firstCard > 21 || secondCard > 21){
    bust(firstCard, secondCard)
  }
  else{
    twentyOne(firstCard, secondCard)
  }
}