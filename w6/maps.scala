val romanNumerals = Map("I"->1, "V"-> 5, "X" -> 10)
val capitalOfCountry = Map("US"->"Washington", "Switzerland"-> "Bern")

println(capitalOfCountry("US"))
println(capitalOfCountry get "Andorra")
println(capitalOfCountry get "US")

def showCapital(country:String) = capitalOfCountry.get(country) match {
	case Some(capital) => capital.toUpperCase
	case None => "missing data"
}

println(showCapital("US"))
println(showCapital("Andorra"))

val fruit = List("apple", "pear", "orange", "pineapple")
println(fruit sortWith(_.length< _.length))
println(fruit.sorted)
println(fruit.groupBy(_.head))

class Poly(val terms:Map[Int, Double]) {
	def + (other:Poly) = new Poly(terms ++ (other.terms map adjust))
	def adjust(term: (Int, Double)): (Int, Double) = {
		val (exp, coeff) = term
		terms get exp match {
			case Some(coeff1) => exp -> (coeff + coeff1)
			case None => exp -> coeff
		}
		
	}
	override def toString = (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff+"x^"+exp) mkString " + "

}

class PolyOptimized(terms0:Map[Int, Double]) {
	def this (bindings:(Int, Double)*) = this(bindings.toMap)
	val terms = terms0 withDefaultValue 0.0
	def + (other:PolyOptimized) = new PolyOptimized((other.terms foldLeft terms)(addTerm)) 
	def addTerm(terms: Map[Int, Double], term:(Int, Double)): Map[Int, Double] = {
		val (exp, coeff) = term
		terms +  (exp -> (coeff + terms(exp)))
		
	}
	override def toString = (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff+"x^"+exp) mkString " + "

}


val p1 = new Poly(Map(1->2.0, 3->4.0, 5->6.2))
val p2 = new Poly(Map(0->3.0, 3->7.0))

println(p1+p2)

val p3 = new PolyOptimized(Map(1->2.0, 3->4.0, 5->6.2))
val p4 = new PolyOptimized(Map(0->3.0, 3->7.0))

println(p3+p4)

val cap1 = capitalOfCountry withDefaultValue "unknown"
println(cap1("Andorra"))