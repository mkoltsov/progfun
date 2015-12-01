def sum(f:Int => Int):(Int, Int) => Int = {
	def sumF(a: Int, b:Int):Int = {
		if (a>b) 0
		else f(a) + sumF(a+1, b)

	}
	sumF
}

def sumInts = sum(x=>x)
def sumCubes = sum(x=>x*x*x)

println(sumCubes(1,10))
println(sum(x=>x*x*x)(1,10))

def sum2(f:Int => Int) (a:Int, b:Int):Int = if (a>b) 0 else f(a) + sum(f)(a+1, b)

println(sum2(x=>x*x*x)(1,10))

val sd = sum2(x=>x*x*x)_

println(sd(1,10))

def sum3(f:Int => Int) (a:Int*) = println(f(a(3)))

sum3(x=>x)(1,3,4,5,6)