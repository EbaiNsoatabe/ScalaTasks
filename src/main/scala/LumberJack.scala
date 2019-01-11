object LumberJack extends App{
  var storage = Array(7, 7, 2, 4, 5, 9, 3, 9, 12)
  var smallest = storage(0)
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
  while(logs > 0) {
    findSmall()
    logPlacement(smallest)
    logs -= 1
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
  newGrid()
}
