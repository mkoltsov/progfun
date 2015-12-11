trait Expr {
	def eval:Int
	def isNumber:Boolean
	def isSum:Boolean
	def numValue:Int
	def leftOp:Expr
	def rightOp:Expr
}

class Number(n:Int) extends Expr {
	def eval = n
	def isNumber:Boolean = true
	def isSum:Boolean = false
	def numValue:Int = n 
	def leftOp:Expr = throw new Error("Number.leftOp")
	def rightOp:Expr = throw new Error("Number.rightOp")
}

class Sum(e1:Expr, e2:Expr) extends Expr {
	def eval = e1.eval + e2.eval
	def isNumber = false
	def isSum = true
	def numValue = throw new Error("Sum.numValue")
	def leftOp = e1
	def rightOp = e2
}

val num1 = new Number(10)
val num2 = new Sum(new Number(5), num1)

println(s"is Number ${num1.isInstanceOf[Number]}")
// println(s"is Nothing ${num1.isInstanceOf[Nothing]}")
println(s"is Any${num1.isInstanceOf[Any]}")
println(s"is AnyRef ${num1.isInstanceOf[AnyRef]}")
println(s"can be AnyRef ${num1.asInstanceOf[AnyRef].isInstanceOf[AnyRef]}")
println(s"can be Any ${num1.asInstanceOf[AnyRef].isInstanceOf[Any]}")
println(s"can be Number ${num1.asInstanceOf[AnyRef].isInstanceOf[Number]}")
// println(s"can be Nothing ${num1.asInstanceOf[AnyRef].isInstanceOf[Nothing]}")