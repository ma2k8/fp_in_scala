package chapter3

object exercise_3_26 {
  def maximum(tr: Tree[Int]): Int = tr match {
    case Leaf(x) => x
    case Branch(a,b) => maximum(a) max maximum(b)
  }

}
