class Rational(x:Int, y:Int) {
	require(y != 0, "denominator must be non zero")
	private def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b, a % b)
	private val g = gcd(x, y)

	def this(x:Int) = this(x,1)
	def numer = x
	def denom = y
	def +(that:Rational) = new Rational(numer * that.denom+that.numer * denom, denom * that.denom)
	def -(that:Rational) = this + that.neg

	def < (that:Rational) = numer*that.denom < that.numer * denom
	def max (that:Rational) = if (this < that) that else this

	override def toString() = s"${numer/g}/${denom/g}"

	def unary_- :Rational = new Rational(-numer, denom) 
}


val rat = new Rational(1,2)
val rat2 = new Rational(2,3)

println(rat)
println(- rat) 
println(rat + rat2)

println(new Rational(1,3) - new Rational(5,7) +  -new Rational(3,2))

val f = new Rational(1)
println(rat < rat2)
println(rat max rat2)
// val rat3 = new Rational(1,0)