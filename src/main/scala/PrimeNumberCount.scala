object PrimeNumberCount extends App {
  var divisor = 2
  var noPrime = 0

  print("Enter a number: ")
  var range = scala.io.StdIn.readInt()

  for(i <- 3 to range by 2){
    divisor = 2
    while(divisor <= math.sqrt(i)){
      if(i % divisor == 0){
        noPrime += 1
        divisor += i
      }
      else{
        divisor += 1
      }
    }
  }

  println(s"There are ${(range / 2) - noPrime} prime numbers in range (1-$range)")
}