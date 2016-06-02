package chapter3

import exercise_3_13._

object exercise_3_18 {
  def map[A,B](as: List[A])(f: A => B): List[B] =
    foldRightLeft(as, Nil: List[B])((a,b) => Cons(f(a), b))
}
