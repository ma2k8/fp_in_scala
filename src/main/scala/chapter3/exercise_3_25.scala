package chapter3

object exercise_3_25 {
  def size[A](tr: Tree[A]): Int = tr match {
    case Leaf(_) => 1
    case Branch(a,b) => 1 + size(a) + size(b)
  }

}
