package chapter3

/**
  * Created by ma2k8 on 5/23/16.
  */
object exercise_3_4 {
  def drop[A](l: List[A], n: Int): List[A] = {
    if (0 <= n) drop(exercise_3_2.tail(l), n-1)
    else l match {
      case Nil => Nil
      case Cons(_,t) => drop(t, n-1)
    }
  }

}
