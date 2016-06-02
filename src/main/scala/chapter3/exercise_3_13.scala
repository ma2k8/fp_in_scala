package chapter3

import exercise_3_10._

object exercise_3_13 {
  def foldRightLeft[A,B](l: List[A], z: B)(f: (A,B) => B): B = foldLeft(l, (b: B) => b)((x,y) => b => x(f(y,b)))(z)
  def foldLeftRight[A,B](l: List[A], z: B)(f: (B,A) => B): B = List.foldRight(l, (b: B) => b)((x,y) => b => y(f(b,x)))(z)
}
