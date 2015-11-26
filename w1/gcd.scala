def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b, a%b)

println(gcd(100,20))
println(gcd(111,27))