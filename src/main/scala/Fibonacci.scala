object Fibonacci extends App{
  def setUp() {
    val range = scala.io.StdIn.readInt
    val fibon = (0 to range).toArray
    println(0)
    println(1)
    newNum(range, fibon)
  }

  def newNum(range:Int, fibon:Array[Int]){
    for(i <- 2 to range) {
      fibon(i) = fibon(i -1) + fibon(i - 2)
      println(fibon(i))
    }
  }
  setUp()
}
