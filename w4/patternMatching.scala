// Expression problem
trait Expr {
	def eval:Int = this match {
		case Number(n) => n  
		case Sum(e1, e2) => e1.eval + e2.eval  
	}

}
case class Number(n:Int) extends Expr 
case class Sum(e1:Expr, e2:Expr) extends Expr

val N = 2

def eval(e:Expr):Int = e match {
	case Number(n) => n 
	case Sum(e1, e2) => eval(e1)+eval(e2) 
	// case Sum(Number(1), e2) => 1+eval(e2) 
}

println(Sum(Number(10), Number(3)).eval)

def show(e:Expr):String = e match {
	case Number(e) => e.toString
	case Sum(e1,e2) => s"${show(e1)} + ${show(e2)}"   
}
println(show(Sum(Number(10), Number(3))))