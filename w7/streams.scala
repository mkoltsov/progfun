val xs = Stream.cons(1, Stream.cons(2, Stream.empty))

val st = Stream(1,2)

val str = (1 to 10000).toStream.filter(_%2==0)(15)

{
	val cf = "prtg"
	println(cf)
}

val stre = 1 #:: st

object Sre {
	def apply = println("inside of an object")
}

println(Sre)

println(str)

def streamRange(lo:Int, hi:Int):Stream[Int] = {
	println(s"${lo} ")
	if (lo> hi) Stream.empty else Stream.cons(lo, streamRange(lo+1, hi))
}

def listRange(lo:Int, hi:Int):List[Int] = if (lo> hi) Nil else lo :: listRange(lo+1, hi)

streamRange(1,10).take(3).toList