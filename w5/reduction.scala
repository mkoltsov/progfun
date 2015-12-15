def sum(xs:List[Int]):Int = xs match {
	case Nil => 0
	case y :: ys => y + sum(ys) 
}

def sumRed(xs:List[Int]):Int = (0::xs) reduceLeft (_+_)
def productRed(xs:List[Int]):Int = (1::xs) reduceLeft (_*_)

val f:Int = 1;
println((0 to 100000000).reduceLeft(_+_))
println((0 to 100000000).foldLeft(f)(_+_))
println(f)

def concat[T](xs:List[T], ys:List[T]):List[T]= (xs foldRight ys) (_ :: _)

println(concat(List(1,2,3,4), List(7,8,9,0)))

def mapFun[T,U](xs:List[T], f:T=>U):List[U] = (xs foldRight List[U]())(x:T=>f(x))
def lengthFun[T](xs:List[T]):Int = (xs foldRight 0)(_.length)