object SmallestMultiple extends App {
  var loop = 1
  for(i <- 20 to 1000000000){
    loop = 1
    while(loop <= 20){
      if(i % loop == 0){
        loop += 1
        if(loop == 21){
          println(i)
          sys.exit()
        }
      }
      else {
        loop += 20
      }
    }
  }
}
