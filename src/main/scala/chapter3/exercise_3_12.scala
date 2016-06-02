package chapter3

import exercise_3_10._

object exercise_3_12 {
  def reverse[A](l: List[A]): List[A] = foldLeft(l, List[A]())((acc, h) => Cons(h, acc))
}
