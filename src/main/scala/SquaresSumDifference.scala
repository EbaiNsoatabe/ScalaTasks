object SquaresSumDifference extends App{
  var sumSquare = Array.fill(1001){0}

  def sumSquares():Int={
    var sumOne = 0
    for(i <- 1 to 1000){
      sumSquare(i) = i*i
      sumOne += sumSquare(i)
    }
    sumOne
  }

  def squareSum():Int={
    sumSquare = Array.fill(1001){0}
    var sumTwo = 0
    for(i <- 1 to 1000){
      sumSquare(i) = i
      sumTwo += sumSquare(i)
    }
    sumTwo*sumTwo
  }
  println(s"The difference between the sum of the squares and the squared sum of all the numbers up to 1000 is $squareSum - $sumSquares = ${squareSum - sumSquares}")
}
