object FizzBuzz extends App {
  println("Enter number: ")
  val range = scala.io.StdIn.readInt()

  for(i <- 1 to range){
    if(i%3 == 0 && i%5 != 0){
      println("fizz ")
    }
    else if(i%5 == 0 && i%3 != 0){
      println("buzz ")
    }
    else if(i%5 == 0 && i%3 == 0){
      println("fizzbuzz ")
    }
    else{
      println(i + " ")
    }
  }
}
