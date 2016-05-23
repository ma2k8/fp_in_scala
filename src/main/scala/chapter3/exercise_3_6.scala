package chapter3

object exercise_3_6 {
  def init[A](l: List[A]): List[A] = {
    l match {
      case Nil => sys.error("empty list")
      case Cons(_,Nil) => Nil
      case Cons(h,t) => Cons(h, init(t))
    }
  }

}
