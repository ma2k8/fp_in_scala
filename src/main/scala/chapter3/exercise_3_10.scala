package chapter3

object exercise_3_10 {
  def foldLeft[A,B](l: List[A], z: B)(f: (B, A) => B): B =
    l match {
      case Nil => z
      case Cons(x,xs) => foldLeft(xs, f(z,x))(f)
    }

}
