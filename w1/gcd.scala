@tailrec
def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b, a%b)

println(gcd(100,20))
println(gcd(111,27))

def factorial(a:Int):Int = if (a==0) 1 else a* factorial(a-1)

println(factorial(4))