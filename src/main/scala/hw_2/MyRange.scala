package hw_2

import scala.::
import scala.collection.mutable.ListBuffer


def MyRange(n: Int, m: Int) : List[Int]= {
  (n, m) match {
    case (x, y) if x > y => Nil
    case _ => (n to m).toList
  }
}


// PS. я не знаю как сделать чтобы Nil возвращался, по идее List() == Nil
@main
def mainMyRange(): Unit = {

  println(MyRange(1, 5))  // –> List(1, 2, 3, 4, 5)
  println(MyRange(3, 3)) //–> List(3))
  println(MyRange(5, 1)) //–> Nil

}

