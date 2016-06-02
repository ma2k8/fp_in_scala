package chapter3

object exercise_3_22 {
  def zipWithSum(a: List[Int], b: List[Int]): List[Int] = (a, b) match {
    case (Nil, _) => Nil
    case (_, Nil) => Nil
    case (Cons(h1,t1), Cons(h2,t2)) => Cons(h1+h2,zipWithSum(t1,t2))
  }

}
