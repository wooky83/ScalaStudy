import scala.collection.mutable.ListBuffer

object Sort {

  def quickSort(xs: Array[Int]): Array[Int] = {
    println("Array is : "+xs.deep)
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      println(pivot)
      Array.concat(
        quickSort(xs filter (pivot >)),
        xs filter (pivot ==),
        quickSort(xs filter (pivot <)))
    }
  }

  quickSort(Array(11, 4, 6, 9, 3, 5, 2, 1))
}