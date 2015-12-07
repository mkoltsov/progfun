abstract class IntSet {
	def incl(x:Int): IntSet
	def contains(x:Int): Boolean
}

class NonEmpty(elem:Int, left:IntSet, right:IntSet) extends IntSet {
	def contains(x:Int):Boolean = 
		if (x < elem) left contains x
		else if (x> elem) right contains x
		else true
	def incl(x: Int):IntSet = this/*
		if (x < elem) new NonEmpty(elem, left incl x, right)
		if (x > elem) new NonEmpty(elem, left, right incl x)
		else this*/
}

object Empty extends IntSet {
	def contains(x: Int) = false
	def incl(x: Int) = new NonEmpty(x, Empty, Empty)
}

