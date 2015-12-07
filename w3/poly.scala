def selectNth[T](n:Int, list:List[T]) =	if (n > list.size) throw new IndexOutOfBoundsException else list(n)

println(selectNth(3, List(1,3,4,5,6,7)))
// println(selectNth(9, List(1,3,4,5,6,7)))