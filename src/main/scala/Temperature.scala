object Temperature extends App{
  print("What season is it? 1 = Spring, 2 = Summer, 3 = Autumn, 4 = Winter ")
  val season = scala.io.StdIn.readInt()

  if(season > 4 || season < 1){
    println("Invalid season information given")
    sys.exit
  }

  def summerCheck(selection:Int):Boolean={
    var summer = true
    if(selection == 2){
      summer = true
    }
    else{
      summer = false
    }
    summer
  }

  print("What is the temperature today? ")
  val temp = scala.io.StdIn.readInt()
  tooHot(temp, false)

  def tooHot(degrees:Int, isSummer:Boolean):Boolean = {
    var output = true
    if (isSummer){
      if (degrees <= 100 && degrees >= 60) {
        output = true
      }
      else {
        output = false
      }
    }
    else {
      if (degrees <= 90 && degrees >= 60) {
        output = true
      }
      else {
        output = false
      }
    }
    output
  }

  def seasonMatch(userInput:Int):String={
    userInput match{
      case 1 => s"Spring"
      case 2 => s"Summer"
      case 3 => s"Autumn"
      case 4 => s"Winter"
    }
  }

  if(tooHot(temp, summerCheck(season))){
    println(s"$temp degrees falls in the range for ${seasonMatch(season)}")
  }
  else{
    println(s"$temp degrees does not fall within range for ${seasonMatch(season)}")
  }
}
