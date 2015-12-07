// package progfun

object hello {
	def main(args: Array[String]) = println("hello")

	trait SomeTrait {
		val f = "rrefd"
		def chef:Int = 1
		def pupa:Int

		def product:Int = chef * pupa
	}

	class Some extends Any with SomeTrait {
		pupa = 2
		println(product)
	}
}