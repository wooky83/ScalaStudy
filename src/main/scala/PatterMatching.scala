/**
  * Created by baw0803 on 2017. 4. 5..
  */
class PatterMatching {

  for {
    x <- Seq(1, 2, 2.7, "one", "two", 'four)
  } {
    val str = x match {
      case 1 => "int 1"
      case i:Int => "other int : "+i
      case d:Double => "a double : "+x
      case "one" => "string one"
      case s:String => "other string: "+s
      case unexpected => "unexpected value: "+unexpected
    }
    println(str)
  }

  def checkY(y:Int) = {
    for {
      x <- Seq(99, 100, 101)
    } {
      val str = x match {
        case 'y' => "found y!"
        case i:Int => "int: "+i
      }
      println(str)
    }
  }
  checkY(100)

  val twoThree = List(2, 3)
  val oneTwoThree = 1 :: twoThree
  println(oneTwoThree)

  for (i <- Seq(1,2,3,4)) {
    i match  {
      case _ if i%2 == 0 => println(s"even : $i")
      case _ => println(s"odd : $i")
    }
  }
}
