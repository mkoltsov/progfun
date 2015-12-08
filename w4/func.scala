//eta expansion
val tripleArg = (x:Int) => x* doubleArg(x)

println(tripleArg(7))

def doubleArg(x:Int):Int = x*x

// List(1) = List.apply(1)
object List {
	def apply[T](x:T):AnyRef = new AnyRef
	def apply[T]():AnyRef = new AnyRef
	def apply[T](x:T, y:T):AnyRef = new AnyRef
	
}
//generics can be omited, since compiler can guess the type by itself
println(List[Int](1))
println(List(1))
println(List())
println(List(1,2))