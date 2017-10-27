import scala.annotation.tailrec

object FP {

  def factorial(i: BigInt) : BigInt = {
    @tailrec
    def fact(i: BigInt, accumulator: BigInt) : BigInt = {
      if (i <= 1) accumulator
      else fact(i-1, i*accumulator)
    }
    fact(i, 1)
  }
  (0 to 5) foreach(i => println(factorial(i)))
}
