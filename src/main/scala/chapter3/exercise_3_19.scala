package chapter3

import exercise_3_13._

object exercise_3_19 {
  def filter[A](as: List[A])(f: A => Boolean): List[A] =
    foldRightLeft(as, Nil: List[A])( (a, b) => if (f(a)) Cons(a, b) else b)
}
