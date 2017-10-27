

object CSSort {

  //aver = O(nlogn) worst(n^2)
  def quickSort(xs: List[Int]): List[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)

      List.concat(
        quickSort(xs filter (pivot >)),
        xs filter (pivot ==),
        quickSort(xs filter (pivot <)))
    }
  }

  quickSort(11 :: 3 :: 2 :: Nil)

  //aver = O(n^2) worst(n^2)
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
      case List() =>
        println("last")
        List()
      case y :: ys =>
        println("insert:"+y + ":" + ys)
        insert(y, insertSort(ys))
    }
  }

  insertSort(5 :: 3 :: 1 :: 2 :: 4 :: 9 :: 6 :: Nil)

}