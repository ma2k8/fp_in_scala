package chapter3

import exercise_3_14._

object exercise_3_15 {
  def flatten[A](l: List[List[A]]): List[A] = List.foldRight(l, Nil:List[A])(append(_,_))
}
