package chapter3

object exercise_3_9 {
  def length[A](l: List[A]): Int = List.foldRight(l, 0)((_, cnt) => cnt + 1)
}
