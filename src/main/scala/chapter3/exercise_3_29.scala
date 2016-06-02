package chapter3

object exercise_3_29 {
  def fold[A,B](tr: Tree[A])(f1: A => B)(f2: (B,B) => B): B = tr match {
    case Leaf(x) => f1(x)
    case Branch(a,b) => f2(fold(a)(f1)(f2) ,fold(b)(f1)(f2))
  }

  def size[A](tr: Tree[A]): Int = fold(tr)(a => 1)(1 + _ + _)
  def maximum(tr: Tree[Int]): Int = fold(tr)(a => a)(_ max _)
  def depth[A](tr: Tree[A]): Int = fold(tr)(a => 0)(1 + _ max _)
  def map[A,B](tr: Tree[A])(f: A => B): Tree[B] = fold(tr)(a => Leaf(f(a)): Tree[B])(Branch(_,_))

}
