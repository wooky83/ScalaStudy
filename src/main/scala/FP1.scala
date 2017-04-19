import scala.annotation.tailrec

/**
  * Created by 1002659 on 2017. 4. 19..
  */
class FP1 {

  def factorial(i : BigInt) : BigInt = {
    @tailrec
    def fact(i:BigInt, accumulator : BigInt) : BigInt = {
      if (i <= 1) accumulator
      else fact(i-1, i*accumulator)
      }
      fact(i, 1)
  }
  (0 to 5) foreach(i => println(factorial(i)))
}
