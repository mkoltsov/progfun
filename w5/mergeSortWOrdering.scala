import math.Ordering
val pair = ("chef", "pupa")
val (label, value) = pair
println(s"${label} = ${value}")
println(s"${pair._1} = ${pair._2}")

def msort[T](xs:List[T])(implicit ord:Ordering[T]):List[T] = {
	val n = xs.length/2
	if (n==0) xs 
	else {
		def merge(xs:List[T], ys:List[T]):List[T] = (xs, ys) match {
			case (Nil, ys) => ys
			case (xs, Nil) => xs
			case (x::xs1, y::ys1) => 
				if (ord.lt(x,y)) x :: merge(xs1, ys) 
	 		   else y :: merge(xs, ys1)  
		}
		
		val (fst, snd) = xs splitAt n 
		merge(msort(fst), msort(snd))
	}
}

val nums = List(2,-4,5,7,1)
println(msort(nums))
val fruits = List("apples", "oranges", "grapes", "peers")
println(msort(fruits))