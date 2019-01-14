object Factorial extends App{
  println("Enter the number for which you need the factorial: ")
  var factorial = 0
  var output = 1
  var factors = 2
  var factorCheck = 0

  def findFactorial() {
    factorial = scala.io.StdIn.readInt()
    output = 1
    factors = 2
    factorCheck = 0
    while (factors <= math.sqrt(factorial)) {
      output = output * factors
      if (output == factorial) {
        println(s"$factorial = $factors!")
        factorCheck += 1
        factors += factorial
      }
      factors += 1
    }
    if(factorCheck == 0){
      println(s"$factorial = NONE")
    }
  }
  findFactorial()
}
