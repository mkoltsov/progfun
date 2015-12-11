def singleton[T](elem:T) = new Cons[T](elem, Nil)
// singleton[Int](1)
// singleton[Boolean](true)

singleton(1)
singleton(true)
trait List[+T] {
	def isEmpty:Boolean
	def head:T
	def tail: List[T]
}

class Cons[T](val head:T, val tail:List[T]) extends List[T] {
	def isEmpty = false
}

object Nil extends List[Nothing] {
	def isEmpty: Boolean = true
	def head:Nothing = throw new NoSuchElementException("Nil.head")
	def tail:Nothing = throw new NoSuchElementException("Nil.tail")
}

