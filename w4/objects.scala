package idealized.scala

object true extends Boolean {
	def ifThenElse[T](t: => T, e: => T) = t
}

object false extends Boolean {
	def ifThenElse[T](t: => T, e: => T) = e
}