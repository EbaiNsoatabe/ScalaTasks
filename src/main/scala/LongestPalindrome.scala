object LongestPalindrome extends App {
  print("Enter a word: ")
  val word = scala.io.StdIn.readLine()
  var b = 0
  import scala.collection.mutable.ListBuffer
  var list = ListBuffer[String]()
  var n = 0

  def palindrome(a:String){
    if(a == a.reverse){
      list += a
      b = 0
    }
    else{
      b += 1
    }
  }

  def check(c:String){
    palindrome(c)
  }

  check(word.substring(0, word.length))
  for(i <- 1 until word.length){
    check(word.substring(0, word.length-i))
    check(word.substring(i, word.length))
    if(i >= 2){
      for(a <- 1 until (word.length - i)){
        check(word.substring(i, word.length-(a-1)))
      }
    }
  }
  for(i <- 0 until list.length){
    if(list(i).length > n){
      n = list(i).length
    }
  }
  for(i <- 0 until list.length){
    if(list(i).length == n){
      print(list(i) + " is the longest palindrome")
      sys.exit()
    }
  }
}