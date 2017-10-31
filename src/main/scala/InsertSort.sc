import scala.collection.mutable.ListBuffer

//aver = O(n^2) worst = O(n^2)
object InsertSort {

  def insertSort(list: List[Int]): List[Int] = {
    def insert(x: Int, xs: List[Int]): List[Int] = {
      xs match {
        case List() => List(x)
        case y :: ys =>
          if (x <= y)
            x :: xs
          else
            y :: insert(x, ys)
      }
    }

    list match {
      case List() => List()
      case y :: ys => insert(y, insertSort(ys))
    }
  }

  insertSort(5 :: 3 :: 1 :: 2 :: 4 :: 9 :: 6 :: Nil)

}