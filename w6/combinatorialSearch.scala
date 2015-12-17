val n = 7 
def isPrime(n:Int):Boolean = (2 until n).forall(x=> n%x!=0)
def pairs(n:Int) = (1 until n).map {i=> (1 until i).map(j=>(i,j))}.flatten.filter(pair=>isPrime(pair._1+pair._2))
def pairsFM(n:Int) = (1 until n).flatMap {i=> (1 until i).map(j=>(i,j))}.filter(pair=>isPrime(pair._1+pair._2))

println(pairs(n))
println(pairsFM(n))