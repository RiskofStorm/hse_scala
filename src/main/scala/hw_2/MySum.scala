package hw_2


def MySum(a: List[Int]): Int = a.foldLeft(0)(_ + _)

@main
def mainMySum(): Unit = {
  println(MySum(List(12, 140, 4, 5, 5, 5, 1, 1, 123, 0, 88, 9)))
  println(MySum(List(9, 1, 4, 0, 5, 6, 2, 8, 3)))
  println(MySum(List(1,2,3)))
}