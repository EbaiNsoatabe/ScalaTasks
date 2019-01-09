object UniqueAddition extends App{
  def add(first:Int, second:Int, third:Int){
    var sum = 0
    if(first != second && first != third && second != third){
      sum = first + second + third
    }
    else if(first == second && first != third){
      sum = third
    }
    else if(second == third && first != second){
      sum = first
    }
    else if(first == third && second != first){
      sum = second
    }
    print(sum)
  }

  print("Enter number: ")
  val firstNum = scala.io.StdIn.readInt()
  print("Enter number: ")
  val secondNum = scala.io.StdIn.readInt()
  print("Enter number: ")
  val thirdNum = scala.io.StdIn.readInt()

  add(firstNum, secondNum, thirdNum)
}