package chapter3

import exercise_3_20._

object exercise_3_21 {
  def filter[A](as: List[A])(f: A => Boolean): List[A] = flatMap(as)(a => if (f(a)) List(a) else Nil)
}
