object Test {

  val hi = 1 :: 2 :: 5 :: 3 :: 7 :: Nil


  def test1(xs: List[Int]): List[Int] = {
    xs match {
      case List() =>
        println("last")
        List()
      case head :: tail =>
        println("head : "+head+" tail: "+tail)
        test1(tail)
    }
  }

  test1(hi)

}