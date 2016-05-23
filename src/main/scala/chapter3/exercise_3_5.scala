package chapter3

object exercise_3_5 {
  @annotation.tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Cons(h,t) if f(h) => dropWhile(t, f)
      case _ => l
    }
  }

}
