package chapter3

object exercise_3_8 {
  // Q
  // foldRight(List(1,2,3),Nil:List[Int])(Cons(_,_))のように、NilおよびCons自体をfoldRightに渡した場合はどうなるか。
  // これがfoldRightとListのデータコンストラクタとの関係について何を表していると思うか。

  // answer
  // - foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_))のように、NilおよびCons自体をfoldRightに渡した場合はどうなるか。
  // 　Cons(1,Cons(2,Cons(3,Nil)))を返す

  // - これがfoldRightとListのデータコンストラクタとの関係について何を表していると思うか。
  // Nilのコンストラクタがアキュームレータの役割を果たしていることについて言及すればよいのだろうか・・・？（正直良く分からない）
}
