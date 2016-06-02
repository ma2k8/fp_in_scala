package chapter3

object exercise_3_14 {
  def append[A](l: List[A], z: A) = List.foldRight(l,List(z))(Cons(_,_))
  def append[A](l: List[A], z: List[A]) = List.foldRight(l,z)(Cons(_,_))
}
