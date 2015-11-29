//@tailrec
def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b, a%b)

println(gcd(100,20))
println(gcd(111,27))

def factorial(a:Int):Int = if (a==0) 1 else a* factorial(a-1)

println(factorial(4))

def tailRecFactorial(n: Int):Int = {
	def loop(acc:Int, n:Int):Int = 
		if (n==0) acc
		else loop(acc*n, n-1)
		loop(1,n)
}

println(tailRecFactorial(4))