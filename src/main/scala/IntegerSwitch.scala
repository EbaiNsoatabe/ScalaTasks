object IntegerSwitch extends App{
  val firstInt = scala.io.StdIn.readInt()
  val secondInt = scala.io.StdIn.readInt()

  def switch(first:Int, second:Int): Unit = first match{
    case first => print(s"$second, $first")
  }

  switch(firstInt,secondInt)
}
