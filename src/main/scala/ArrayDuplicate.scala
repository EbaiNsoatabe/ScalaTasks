object ArrayDuplicate extends App {
  val unique = Array.fill(1000000){scala.util.Random.nextInt(999999)}
  val length = unique.length
  def equal(a:Int, b:Int){
    if(a == b) {
      println(s"The duplicate integer is $a")
      sys.exit()
    }
    else if(a == unique(length - 2) && b == unique(length - 1)){
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