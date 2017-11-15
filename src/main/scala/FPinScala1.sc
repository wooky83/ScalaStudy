import scala.annotation.tailrec

def fib(n: Int): Int = {
  @tailrec
  def loop(index: Int, pre: Int, cur: Int): Int = {
    if (index == 0) pre
    else loop(index - 1, cur, pre + cur)
  }
  loop(n, 0, 1)
}

def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
  @tailrec
  def go(n: Int): Boolean =
    if (n >= as.length-1) true
    else if (gt(as(n), as(n+1))) false
    else go(n+1)
  go(0)
}

def curry[A,B,C](f: (A, B) => C): A => (B => C) =
   A => B => f(A, B)

def uncurry[A,B,C](f: A => B => C): (A, B) => C =
  (A, B) => f(A)(B)

def compose[A,B,C](f: B => C, g: A => B): A => C =
  A => f(g(A))
