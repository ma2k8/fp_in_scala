package chapter2

object exercise_2_1 {

  case class FibNum(current: Int, next: Int) {
    def plus: FibNum = FibNum(next, next + current)
  }

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(v: FibNum, max: Int): FibNum = {
      if (max <= 0) v
      else loop(v.plus, max-1)
    }
    loop(FibNum(0,1), n).current
  }

}
