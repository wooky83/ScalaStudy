/**
  * Created by baw0803 on 2017. 4. 5..
  */
object PatterMatching {

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


object PatternMatching2 {
  val list = 1 +: 2 +: 3+: 4+: Nil

  case class Address(street : String, city:String, country:String)
  case class Person(name : String, age : Int, address : Address)

  val alice = Person("Allice", 25, Address("1", "chicago", "USA"))
  val bob = Person("Bob", 2, Address("2", "miami", "USA"))
  val charlie = Person("Charlie", 3, Address("3", "Boston", "USA"))

  for (person <- Seq(alice, bob, charlie)) {
    person match {
      case p @ Person("Allice", 25, address) => println(s"Hi Alice! $p")
      case p @ Person("Bob", 2, a @ Address(street, city, country)) => println(s"Hei ${p.name}! age ${p.age}, in ${a.city}")
      case p @ Person(name, age, _) => println(s"Who are you $age year-old $name? $p")
    }
  }
}
