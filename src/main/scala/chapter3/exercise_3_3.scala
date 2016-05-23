package chapter3

object exercise_3_3 {
  def setHead[A](l: List[A], h: A): List[A] = {
    l match {
      case Nil => throw new RuntimeException("empty list")
      case Cons(_,t) => Cons(h,t)
    }
  }

}
