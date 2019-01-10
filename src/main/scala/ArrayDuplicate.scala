object ArrayDuplicate extends App {
  val unique = Array.fill(10000000){scala.util.Random.nextInt(9999999)}
  val length = unique.length
  def equal(firstInteger:Int, secondInteger:Int){
    if(firstInteger == secondInteger) {
      println(s"The duplicate integer is $firstInteger")
      sys.exit()
    }
    else if(firstInteger == unique(length - 2) && secondInteger == unique(length - 1)){
      println("There are no duplicates")
    }
  }
  length match {
    case 0 => println("There are no elements in this array")
    case 1 => println("There is only one element in this array so there are no duplicates")
    case 2 => if(unique(0) == unique(1)){
                println(s"The duplicate integer is ${unique(0)}")
              }
              else{
                println("There are no duplicates")
              }
    case _ => for(i <- 0 until length; j <- 1 until length){
      if(i != j){
        equal(unique(i), unique(j))
      }
    }
  }
}