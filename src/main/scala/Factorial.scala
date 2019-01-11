object Factorial extends App{
  print("Enter the number for which you need the factorial: ")
  val factorial = scala.io.StdIn.readInt()
  var output = 1
  var factors = 2
  var factorCheck = 0

  def findFactorial() {
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