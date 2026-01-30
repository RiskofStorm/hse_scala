package hw_1


//@tailrec
def mergeSortUnique(vector: Vector[Int]) : Vector[Int] = {
    if (vector.length <= 1) return vector

    val mid = vector.length / 2
    val (leftPart, rightPart) = vector.splitAt(mid)

    val left = mergeSort(leftPart)
    val right = mergeSort(rightPart)

    mergeUnique(left, right)
}

def mergeUnique(left:Vector[Int], right: Vector[Int]): Vector[Int] = {
  val merged: ListBuffer[Int] = ListBuffer()
  var lId = 0
  var rId = 0

  while (lId < left.length && rId < right.length){
      if (left(lId) < right(rId)){
        merged.append(left(lId))
        lId += 1
        // это все что я добавил в MergeSortUnique
      }else if(left(lId) == right(rId)){
        merged.append(left(lId))
        lId += 1
        rId += 1
      }else {
        merged.append(right(rId))
        rId += 1
      }

   }
  while (lId < left.length) {merged.append(left(lId)) ; lId += 1}
  while (rId < right.length) {merged.append(right(rId)); rId += 1}

  merged.toVector

}



@main
def sortUnique(): Unit = {

  val data: Vector[Int] = Vector(9,1,4,0,5,6,2,2,3,1,1,8,3)
  print(mergeSortUnique(data).toString())

}





