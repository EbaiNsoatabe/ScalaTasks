object ListSplit extends App{
  val myList = List(1, 5, 4, 2, 3, 5, 7, 8, 5, 6, 12)
  val splitFirst = scala.io.StdIn.readInt
  var newListOne = scala.collection.mutable.ListBuffer[Int]()
  var newListTwo = scala.collection.mutable.ListBuffer[Int]()

  for(i <- 0 until splitFirst){
    newListOne += myList(i)
  }

  for(j <- splitFirst until myList.length){
    newListTwo += myList(j)
  }

  val output = Tuple2(newListOne, newListTwo)
  print(output)
}
