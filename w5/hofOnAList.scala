//Naive implementation 
def scaleList(xs:List[Double], factor:Double):List[Double] = xs match {
	case Nil => xs 
	case y::ys => y * factor :: scaleList(ys, factor) 
}

abstract class List[T]  {
	def map[U](f:T => U):List[U] = this match {
		case Nil => this 
		case x :: xs  => f(x) :: xs.map(f) 
	}

	def filter(p: T => Boolean):List[T] = this match {
		case Nil => this
		case x::xs => if (p(x)) x :: xs.filter(p) else xs.filter(p)  
	}
	
}

// less Naive
def scaleList(xs:List[Double], factor:Double):List[Double] = xs map (x => x*factor)
def posElem(xs:List[Int]):List[Int] = xs filter (x => x > 0)
