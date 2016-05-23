package chapter3

object exercise_3_2 {
  def tail[A](l: List[A]): List[A] = {
    l match {
      case Nil => throw new RuntimeException("empty list")
      case Cons(_,t) => t
    }
  }
}
