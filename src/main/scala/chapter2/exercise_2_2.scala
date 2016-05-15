package chapter2

object exercise_2_2 {

  // isSorted[Int](Array(1,2,3), (x:Int,y:Int) => if (x <= y) true else false)
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean) = {
    @annotation.tailrec
    def loop(ar: Seq[A]): Boolean = {
      ar match {
        case Seq(x ,y, vs@_*) =>
          if (ordered(x,y)) loop(y +: vs)
          else false
        case _ => true
      }
    }
    loop(as.toSeq)
  }

}
