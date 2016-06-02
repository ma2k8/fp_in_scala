package chapter3

import exercise_3_10._

object exercise_3_11 {

  def sum(l: List[Int]): Int = foldLeft(l,0)(_+_)
  def product(l: List[Int]): Int = foldLeft(l,1)(_*_)
  def length[A](l: List[A]): Int = foldLeft(l,0)((acc,x) => acc + 1)

}
