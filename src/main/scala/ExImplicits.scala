/**
  * Created by 1002659 on 2017. 4. 12..
  */
class ExImplicits {

  implicit val taxRate = 0.05F

  def calculateTax(amount : Float)(implicit rate : Float) : Float = {
    println("calculateTax : "+amount * rate)
    amount * rate
  }

  calculateTax(50)
}
