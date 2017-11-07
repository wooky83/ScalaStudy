
import scala.collection.mutable.ListBuffer
import scala.math.BigInt

object SeqEx {

  val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map( n => n._1 + n._2)

  val list = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
  val mutableList: ListBuffer[Int] = ListBuffer()
  mutableList += 1
  mutableList += 2
  mutableList += 3

}