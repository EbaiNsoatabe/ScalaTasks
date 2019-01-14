object DigitAddition extends App{
  def separationTwoDigit(inputNum:Int):Int={
    val tens = inputNum/10
    val units = inputNum - tens*10
    printOut(tens)
    print(units)
    print(" = ")
    tens + units
  }

  def separationThreeDigit(inputNum:Int):Int={
    val hundreds = inputNum/100
    printOut(hundreds)
    hundreds + separationTwoDigit(inputNum - hundreds*100)
  }

  def separationFourDigit(inputNum:Int):Int={
    val thousands = inputNum/1000
    printOut(thousands)
    thousands + separationThreeDigit(inputNum - thousands*1000)
  }

  def separationFiveDigit(inputNum:Int):Int={
    val tenThousands = inputNum/10000
    printOut(tenThousands)
    tenThousands + separationFourDigit(inputNum - tenThousands*10000)
  }

  def separationSixDigit(inputNum:Int):Int={
    val hundredThousands = inputNum/100000
    printOut(hundredThousands)
    hundredThousands + separationFiveDigit(inputNum - hundredThousands*100000)
  }

  def separationSevenDigit(inputNum:Int):Int={
    val millions = inputNum/1000000
    printOut(millions)
    millions + separationSixDigit(inputNum - millions*1000000)
  }

  def numberSelection(): Unit ={
    println("Enter your number (10-9999999): ")
    val numEntry = scala.io.StdIn.readInt()
    if(numEntry > 9999999){
      println("Number too large. Please enter a number within given range (1-9999999).")
      numberSelection()
    }
    else {
      println(separationSevenDigit(numEntry))
    }
  }

  def printOut(digitVal: Int): Unit ={
    if(digitVal > 0){
      print(s"$digitVal + ")
    }
  }

  numberSelection()
}
