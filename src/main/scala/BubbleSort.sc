import scala.collection.mutable.ListBuffer

//aver = O(n^2) worst = O(n^2)
object BubbleSort {

  def bubbleSort(list: List[Int]) : List[Int]= {
    def bubble(x: Int, xs: List[Int]): List[Int] = {
      xs match {
        case List() => List(x)
        case y :: ys => if (x > y) y :: bubble(x, ys) else x :: bubble(y, ys)
      }
    }

    var mutableList = ListBuffer[Int]()
    var tmpList = list
    for (i <- 0 until list.length) {
      val result = bubble(tmpList.head, tmpList.tail)
      mutableList.insert(0, result.last)
      tmpList = result.dropRight(1)
    }
    mutableList.toList
  }

  bubbleSort(9 :: 7 :: 3 :: 1 :: 2 :: 8 :: 4 :: 5 :: 6 :: Nil)
}
