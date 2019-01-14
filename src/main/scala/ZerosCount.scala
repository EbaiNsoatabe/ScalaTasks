object ZerosCount extends App{
  val numGroup = Array(0, 6, 6, 7, 7, 8, 0, 8, 0, 0, 43)
  var count = 0
  var index = 0

  def zeroChecker(num:Int): Unit ={
    if(num == 0){
      count += 1
    }
    index += 1
    if(index < numGroup.length) {
      zeroChecker(numGroup(index))
    }
  }

  zeroChecker(numGroup(index))
  println(s"There are $count zeros in the list")
}
