object PythagoreanTriplet extends App{
  for(a <- 1 to 500; b <- 1 to 500; c <- 1 to 500){
    if(a*a + b*b == c*c && a+b+c == 1000){
      print(s"a = $a \nb = $b \nc = $c")
      sys.exit()
    }
  }
}
