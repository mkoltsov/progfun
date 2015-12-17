val n = 7 
def isPrime(n:Int):Boolean = (2 until n).forall(x=> n%x!=0)
def pairs(n:Int) = (1 until n).map {i=> (1 until i).map(j=>(i,j))}.flatten.filter(pair=>isPrime(pair._1+pair._2))
def pairsFM(n:Int) = (1 until n).flatMap {i=> (1 until i).map(j=>(i,j))}.filter(pair=>isPrime(pair._1+pair._2))

println(pairs(n))
println(pairsFM(n))

case class Person(name:String, age:Int)

val persons = Vector(Person("chef", 30), Person("pupa", 29))

persons.filter(_.age>29).map(p=>p.name).foreach(println)

println(s"${for (p <-persons if p.age>29) yield p.name}")

val s = for {
 i<-1 until n 
 j <-1 until i 
 if isPrime(i+j)
} yield(i, j)

println(s)

def scalarProduct(xs:Vector[Double], ys:Vector[Double]):Double = 
(for ((x,y) <- xs zip ys) yield x*y).sum


println(scalarProduct(Vector(1,2,3,4), Vector(5,6,9,10))) 
//(xs zip ys).map(xy=> xy._1 * xy._2).sum