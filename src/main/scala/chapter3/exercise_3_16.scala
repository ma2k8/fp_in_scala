package chapter3

import exercise_3_13._

object exercise_3_16 {
  def allIncrement(l: List[Int]): List[Int] = foldRightLeft(l, List[Int]())( (a,b) => Cons(a + 1,b))
}
