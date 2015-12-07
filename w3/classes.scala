// package progfun

object hello {
	def main(args: Array[String]):Unit = {
		println("hello")
		new Some
	}

	trait SomeTrait {
		val f = "rrefd"
		def chef:Int = 1
		def pupa:Int

		def product:Int = chef * pupa
	}
	class SomeClass

	class Some extends SomeClass with SomeTrait {
		override def chef = 3
		def pupa = 2
		println(s"${product} - ${f}")
	}
}

// object myClass extends App {
// 	println("1111")
// }

// myClass.main(args)