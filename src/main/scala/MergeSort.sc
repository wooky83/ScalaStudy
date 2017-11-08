

//aver = O(nlogn) worst = O(n^2)
object MergeSort {

  def mergeSort(list: List[Int]): List[Int] = {

    def merge(left: List[Int], right: List[Int]): List[Int] = {
      (left, right) match {
        case(left, Nil) => left
        case(Nil, right) => right
        case(leftHead :: leftTail, rightHead :: rightTail) =>
          if (leftHead < rightHead) leftHead::merge(leftTail, right)
          else rightHead :: merge(left, rightTail)
      }
    }

    val n = list.length / 2
    if (n == 0) list //
    else {
      val (left, right) = list.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  mergeSort(9 :: 7 :: 3 :: 1 :: 2 :: 8 :: 4 :: 5 :: 6 :: Nil)
}