object BottlesWall extends App{
  def bottleSong() {
    val bottle = (99 to 2 by -1).toList
    bottle foreach (element => println(s"There are $element green bottles standing on the wall. \n$element green bottles standing on the wall. \nAnd if one green bottle," +
      s" should accidentally fall, \nthere'll be ${element - 1} green bottles standing on the wall. \n"))
    println(s"There is 1 green bottle standing on the wall. \n1 green bottle, standing on the wall. \nAnd if one green bottle," +
      s" should accidentally fall, \nthere'll be no green bottles standing on the wall. \n")
    println("There are no green bottles standing on the wall")
  }
  bottleSong()

  var bottles = 99
  def greenBottles(){
      println(s"There are $bottles green bottles standing on the wall. \n$bottles green bottles standing on the wall. \nAnd if one green bottle, should accidentally" +
        s"fall, \nthere'll be ${bottles - 1} green bottles standing on the wall. \n")
      bottles -= 1
      if(bottles >= 1) {
        greenBottles()
      }
      else if(bottles == 1){
        println(s"There are $bottles green bottles standing on the wall. \n$bottles green bottles standing on the wall. \nAnd if one green bottle, should accidentally" +
          s" fall, \nthere'll be no green bottles standing on the wall. \n")
      }
      else{
        println(s"There are no green bottles standing on the wall.")
      }
  }
  greenBottles()
}