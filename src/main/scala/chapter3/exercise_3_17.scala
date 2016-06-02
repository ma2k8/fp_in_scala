package chapter3

import exercise_3_13._

object exercise_3_17 {
  def double2string(l: List[Double]): List[String] =
    foldRightLeft(l, Nil:List[String])((h,t) => Cons(h.toString,t))
}
