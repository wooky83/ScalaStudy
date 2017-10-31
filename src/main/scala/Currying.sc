
object Currying {

  def cat2(s1 : String) = (s2:String) => s1 + s2

  cat2("1")("2")
}
