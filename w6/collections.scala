val f:Seq[String] = Vector("Apples")
println(f+:"oranges")
println(f:+"oranges")
val vec = 31337 +: Vector.range(0, 100000) :+31337

val mr = vec.filter(x=>x%2==0).map(_ /2).reduceLeft((x,y)=>x-y)
println(mr)

val xs = Array(1,2,3,44)
println(xs map (x=>x*2))

val s = "Hello World"

println(s.filter(_.isUpper))

println(1 until 5)
println(1 to 5)
println(1 to 10 by 3)

println(vec.exists(p=>p%111==0))
println(vec.forall(p=>p%1==0))
println((Vector("apples", "oranges", "peers") zip Vector("apples", "oranges", "peers", "grapes")).unzip)

println(Vector("Hello World", "CHEF","pupa").flatMap(x=>x.split(" ")))
println(Vector(1,2,3,4).sum)
println(Vector(1,2,3,4).product)
println(Vector(1,2,3,4).max)
println(Vector(1,2,3,4).min)