package chapter3

object exercise_3_28 {
  def map[A,B](t: Tree[A])(f: A => B): Tree[B] = t match {
    case Leaf(x) => Leaf(f(x))
    case Branch(a,b) => Branch(map(a)(f),map(b)(f))
  }

}
