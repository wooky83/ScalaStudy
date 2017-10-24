
import scala.language.implicitConversions

object ExImplicits {

  implicit val taxRate = 0.05F

  def calculateTax(amount : Float)(implicit rate : Float) : Float = {
    println("calculateTax : "+amount * rate)
    amount * rate
  }

  calculateTax(50)
}

object ExImplicits2 {
  val a = (1, "one")
  val b = 1->"one"
  val c = Tuple2(1, "one")

  case class Foo(s : String)
  object Foo {
    implicit def fromString(s : String) : Foo = Foo(s)
  }

  implicit def overridingConversion(s:String) : Foo = Foo("Boo : "+s)

  class O {
    def m1(foo: Foo) = println(foo)
    def m(s : String) = m1(s)
  }
}
