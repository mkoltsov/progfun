class Rational(x:Int, y:Int) {
	require(y != 0, "denominator must be non zero")
	private def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b, a % b)
	private val g = gcd(x, y)
	def numer = x/g
	def denom = y/g
	def add(that:Rational) = new Rational(numer * that.denom+that.numer * denom, denom * that.denom)
	def sub(that:Rational) = add(that.neg)

	def less (that:Rational) = numer*that.denom < that.numer * denom
	def max (that:Rational) = if (this.less(that)) that else that

	override def toString() = s"${numer}/${denom}"

	def neg() = new Rational(-numer, denom) 
}


val rat = new Rational(1,2)
val rat2 = new Rational(2,3)

println(rat)
println(rat.neg) 
println(rat.add(rat2))

println(new Rational(1,3).sub(new Rational(5,7)).add(new Rational(3,2).neg))

println(rat.less(rat2))
println(rat.max(rat2))
val rat3 = new Rational(1,0)