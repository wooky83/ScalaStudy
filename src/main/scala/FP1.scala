/**
  * Created by 1002659 on 2017. 4. 19..
  */
class FP1 {

  def factorial(i : Int) : Long = {
    def fact(i:Int, accumulator : Int) : Long = {
      if (i <= 1) accumulator
      else fact(i-1, i*accumulator)
      }
      fact(i, 1)
  }
  (0 to 5) foreach(i => println(factorial(i)))
}
