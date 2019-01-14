object LumberJack extends App{
  var storage = Array.fill(9){scala.util.Random.nextInt(9)}
  println("This is the current storage configuration: ")
  newGrid()
  println()
  var smallest = storage(0)
  println("How many logs do you need to store? ")
  var logs = scala.io.StdIn.readInt()
  var loopCounter = 0

  def findSmall(){
    smallest = storage(0)
    for(i <- 0 until storage.length) {
      if (storage(i) < smallest) {
        smallest = storage(i)
      }
    }
    smallest
  }

  def logPlacement(small:Int): Unit ={
    loopCounter = 0
    while(loopCounter < storage.length) {
      if (storage(loopCounter) == small) {
        storage(loopCounter) += 1
        loopCounter += storage.length
      }
      else {
        loopCounter += 1
      }
    }
  }

  def newGrid() {
    for (i <- 0 until 3) {
      print(storage(i) + " ")
    }
    println()
    for (i <- 3 until 6) {
      print(storage(i) + " ")
    }
    println()
    for (i <- 6 until 9) {
      print(storage(i) + " ")
    }
    println()
  }

  while(logs > 0) {
    findSmall()
    logPlacement(smallest)
    logs -= 1
  }

  println()
  println("This should become: ")
  newGrid()
}
