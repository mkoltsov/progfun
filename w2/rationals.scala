class Rational(x:Int, y:Int) {
	def numer = x
	def denom = y
	def add(that:Rational) = new Rational(numer * that.denom+that.numer * denom, denom * that.denom)
	def sub(that:Rational) = new Rational(numer * that.denom-that.numer * denom, denom * that.denom)

	override def toString() = s"${numer}/${denom}"

	def neg() = new Rational(-numer, denom) 
}


val rat = new Rational(1,2)
val rat2 = new Rational(2,3)

println(rat)
println(rat.neg) 
println(rat.add(rat2))

println(new Rational(1,3).sub(new Rational(5,7)).add(new Rational(3,2).neg))