import scala.language.postfixOps

//aver = O(nlogn) worst = O(n^2)
object QuickSort {

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
}