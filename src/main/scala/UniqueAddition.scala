object UniqueAddition extends App{
  var sum = 0

  def add(a:Int, b:Int, c:Int):Int={
    if(a != b && a != c && b != c){
      sum = a + b + c
    }
    else if(a == b && a != c){
      sum = c
    }
    else if(b == c && a != b){
      sum = a
    }
    else if(a == c && b != a){
      sum = b
    }
    return sum
  }

  print("Enter number: ")
  val firstNum = scala.io.StdIn.readInt()
  print("Enter number: ")
  val secondNum = scala.io.StdIn.readInt()
  print("Enter number: ")
  val thirdNum = scala.io.StdIn.readInt()

  print(add(firstNum, secondNum, thirdNum))
}
