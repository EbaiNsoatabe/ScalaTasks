object CreditCard extends App {
  def doubles(numOne:Int):Int={
    var out = 0
    numOne match{
      case 5 => out=1
      case 6 => out=3
      case 7 => out=5
      case 8 => out=7
      case 9 => out=9
    }
    return(out)
  }

  def luhn(digits:String): Unit ={
    var numbers = Array.fill(digits.length+1){0}
    var output = 0

    for(i <- 1 to digits.length){
      numbers(i) = (digits.substring(digits.length - i, digits.length - (i-1))).toInt
    }

    for(j <- numbers.length-1 to 1  by -2) {
      if(numbers(j) < 5) {
        numbers(j) = numbers(j) * 2
      }
      else{
        numbers(j) = doubles(numbers(j))
      }
    }

    for(k <- 1 until numbers.length){
      output += numbers(k)
      println(output + " ")
    }

    println(s"This number adds up to $output")

    if(output % 10 == 0){
      println(s"$digits is therefore valid by the Luhn algorithm")
    }
    else{
      println(s"$digits is therefore not valid")
    }
  }
  println("Enter a number: ")
  var numOne = scala.io.StdIn.readLine
  luhn(numOne)
}