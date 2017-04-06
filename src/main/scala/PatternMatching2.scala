/**
  * Created by 1002659 on 2017. 4. 6..
  */
class PatternMatching2 {
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
