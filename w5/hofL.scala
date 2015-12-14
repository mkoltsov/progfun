val ls = List(1,2,3,4,5)

println(s"filter ${ls.filter(x=> x>3)}")
println(s"filterNot ${ls.filterNot(x=> x>3)}")
println(s"partition ${ls partition (x=> x>3)}")
println(s"takeWhile ${ls takeWhile (x=> x>0)}")
println(s"dropWhile ${ls dropWhile (x=> x>0)}")
println(s"span ${ls span (x=> x>0)}")
println(s"map ${ls.map(x=> x*3)}")
// ls.flatMap(x=>println(x))

def pack[T](xs:List[T]):List[List[T]] = xs match {
	case Nil => Nil
	case x::xs => val(first, rest) =  xs span (y=> y==x)
	first :: pack(rest)
}

println(pack(List("a", "a", "a","b","b", "a")))

// def sum(ls:List[Int]) = (0::ls) reduceLeft((x,y)=> x+y)
def sum(ls:List[Int]) = (0::ls) reduceLeft(_+_)
def sum1(ls:List[Int]) = (ls foldLeft 0)(_+_)
// def product(ls:List[Int]) = (1::ls) reduceLeft((x,y)=> x*y)
def product(ls:List[Int]) = (1::ls) reduceLeft(_*_)
def product1(ls:List[Int]) = (ls foldLeft 1) (_*_)
println(sum(List(1,2,3,4,5)))
println(sum1(List(1,2,3,4,5)))
println(product(List(1,2,3,4,5)))
println(product1(List(1,2,3,4,5)))

// println(encode(List("a", "b","a"))) 

def reduceLeft(op:(T, T) => T):T = this match {
	case Nil => throw new Error ("Nil.reduceLeft") 
	case x::xs => (xs foldLeft x) (op) 
}

def foldLeft[U](z:U)(op:(U, T) => U):U = this match {
	case Nil => z 
	case x::xs => (xs foldLeft op(z,x))(op) 
}

