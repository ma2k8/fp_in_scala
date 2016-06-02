package chapter3

object exercise_3_27 {
  def depth[A](t: Tree[A]): Int = t match {
    case Leaf(_) => 0
    case Branch(a,b) => 1 + (depth(a) max depth(b))
  }

}
