object CreditCard extends App {
  println("Enter a number: ")
  val numString = scala.io.StdIn.readLine()
  var checkNum = numString.substring(numString.length-1, numString.length).toInt

  def doubles(numOne:Int):Int={
    var out = 0
    numOne match{
      case 5 => out=1
      case 6 => out=3
      case 7 => out=5
      case 8 => out=7
      case 9 => out=9
    }
    out
  }

  def luhn(digits:String): Unit ={
    var numbers = Array.fill(digits.length+1){0}
    var output = 0

    for(i <- 1 to digits.length){
      numbers(i) = digits.substring(digits.length - i, digits.length - (i-1)).toInt
    }

    if(numbers.length % 2 != 0) {
      for (j <- numbers.length - 1 to 1 by -2) {
        if (numbers(j) < 5) {
          numbers(j) = numbers(j) * 2
        }
        else {
          numbers(j) = doubles(numbers(j))
        }
      }
    }

    else{
      for(j <- numbers.length-2 to 1 by -2) {
        if(numbers(j) < 5) {
          numbers(j) = numbers(j) * 2
        }
        else{
          numbers(j) = doubles(numbers(j))
        }
      }
    }

    for(k <- 1 until numbers.length){
      output += numbers(k)
      println(output)
    }

    println(s"This number adds up to $output")

    if(output % 10 == 0){
      println(s"$digits is therefore valid by the Luhn algorithm")
      sys.exit()
    }
    else{
      println("Invalid number.")
      check(output)
    }
  }

  def check(invalid:Int): Unit ={
    var check = 0
    if(invalid > 9 && invalid < 100) {
      check = invalid % 10
      if(check <= checkNum){
        checkNum -= check
        println(s"You could try ${numString.substring(0, numString.length-1)}$checkNum?")
      }
      else{
        checkNum += (10 - check)
        println(s"You could try ${numString.substring(0, numString.length-1)}$checkNum?")
      }
      reSelect(s"${numString.substring(0, numString.length-1)}$checkNum")
    }
  }

  def reSelect(newNum:String): Unit ={
    println("Would you like to use this number? Enter 1 for yes or any other number for no.")
    var choice = scala.io.StdIn.readInt()
    choice match{
      case 1 => luhn(newNum)
      case _ => sys.exit()
    }
  }
  luhn(numString)
}