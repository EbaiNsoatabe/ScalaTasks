object CommonDivisor extends App{
  var storage = 0

  def dividesBy(numerator:Int, denominator:Int):Boolean={
    var trueFalse = false
    if(numerator % denominator == 0){
      trueFalse = true
    }
    trueFalse
  }

  def common(larger:Int, smaller:Int): Unit ={
    var smallest = 0
    for(i <- 1 to larger){
      if(dividesBy(larger, i)){
        if(dividesBy(smaller, i)) {
          storage = i
        }
      }
    }
  }

  def startMenu(): Unit ={
    println("Enter the first number:")
    val firstNum = scala.io.StdIn.readInt()
    println("Enter the second number:")
    val secondNum = scala.io.StdIn.readInt()

    if(firstNum >= secondNum){
      common(firstNum, secondNum)
    }
    else{
      common(secondNum, firstNum)
    }
    println(s"The largest common divisor of $firstNum and $secondNum is $storage")
  }

  startMenu()
}
