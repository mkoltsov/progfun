val fruit:List[String] = List("apple", "orange")
val nums = List(1, 2)
val diag = List(List(1,2),List(0))
val empty = List()

val chef:List[String] = "apple" :: "orange":: "peer" :: Nil

// val ch2 = Nil.::"chef"
println(chef)
println(s"tail is ${chef.tail}")
println(s"head is ${chef.head}")
println(s"tail.head is ${chef.tail.head}")
println(s"length is ${chef.length}")
println(s"last is ${chef.last}")
println(s"init is ${chef.init}")
println(s"take is ${chef take 1}")
println(s"drop is ${chef drop 2}")
println(s"index is ${chef(2)}")
println(s"++ is ${chef ++ fruit}")
println(s"::: is ${chef ::: fruit}")
println(s"reverse is ${chef.reverse}")
println(s"contains is ${chef contains "apple"}")
// println(s"updated is ${chef updated ()}")
println(fruit)
// println(ch2)

val fd = 1 :: 2 :: Nil
chef match {
	case List() => println("empty") 
	case x :: xs => println(s"${x} -- ${xs}") 
}
