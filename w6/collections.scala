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
println((Vector("apples", "oranges", "peers") zip Vector("love", "dont love", "hate", "grapes")).unzip)

println(Vector("Hello World", "CHEF","pupa").flatMap(x=>x.split(" ")))
println(Vector(1,2,3,4).sum)
println(Vector(1,2,3,4).product)
println(Vector(1,2,3,4).max)
println(Vector(1,2,3,4).min)

println((1 to 1000).flatMap{x:Int => (x to 100).map(y => (x,y))})

def scalarProduct(xs:Vector[Double], ys:Vector[Double]):Double = (xs zip ys).map(xy=> xy._1 * xy._2).sum
//def scalarProduct2(xs:Vector[Double], ys:Vector[Double]):Double = (xs zip ys).map(case (x, y)=> x * y).sum

println(scalarProduct(Vector(1,2,3,4), Vector(5,6,9,10)))
//println(scalarProduct2(Vector(1,2,3,4), Vector(5,6,9,10)))

def isPrime(n:Int):Boolean = !(2 until n).forall(x=> n%x!=0)

println(isPrime(23))