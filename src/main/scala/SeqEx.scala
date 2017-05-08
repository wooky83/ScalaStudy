/**
  * Created by 1002659 on 2017. 4. 24..
  */
import scala.math.BigInt

class SeqEx {

  val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map( n => n._1 + n._2)
}
