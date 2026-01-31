import scala.collection.mutable.ListBuffer


// TOP N minimal values
def topNsort(vector: Vector[Int], n: Int) : Vector[Int] = {
  if (vector.length <= 1 || n <= 0) return vector
  val (topNvecStart, restVec) = vector.splitAt(n)
  val topN: ListBuffer[Int] = ListBuffer(topNvecStart*)

  for (v <- restVec) {
    val topnMax = topN.max
    if (v < topnMax){
      topN(topN.indexOf(topnMax)) = v
    }
  }
  topN.toVector
}

// Я не сделал сортировку topN, в ТЗ этого нету, просто топ N
@main
def topnMain(): Unit = {

//  println(topNsort(Vector(1,23,4,5,5,5,1,1), 4))
  println(topNsort(Vector(12,140,4,5,5,5,1,1,123,0, 88,9), 5))
  println(topNsort(Vector(9, 1, 4, 0, 5, 6, 2, 8, 3), 4)) // Vector(0,1,2,3)

//  print(topNsort(Vector(5, 4, 3, 2, 1), 3)) // Vector(1,2,3)

//  print(topNsort(Vector(1, 1, 1, 23, 4), 3)) // Vector(1,1,1)

//  println(topNsort(Vector(-5, 3, -1, 0, -3), 3)) // Vector(-5,-3,-1)

//  print(topNsort(Vector(100, 50, 20, 10, 5, 1), 2)) // Vector(1,5)
}

