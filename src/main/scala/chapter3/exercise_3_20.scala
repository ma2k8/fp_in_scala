package chapter3

import exercise_3_15._
import exercise_3_18._

object exercise_3_20 {
  def flatMap[A,B](l: List[A])(f: A => List[B]): List[B] =
    flatten(map(l)(f))
}
