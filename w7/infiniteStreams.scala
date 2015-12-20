def from(n:Int):Stream[Int] = n #:: from(n+1)

println(from(1000).take(3).toList)

val nats = from(0)

val natsm4 = nats filter (_%2==0)

println((natsm4 take 100).toList)

def sieve(s:Stream[Int]):Stream[Int] = s.head #:: sieve(s.tail filter (_ % s.head !=0))

val primes = sieve(from(2))

println(primes.take(100).toList)

def sqrtStream(x:Double):Stream[Double] = {
	def improve(guess:Double) = (guess + x) /2
	lazy val guesses:Stream[Double] = 1 #:: (guesses map improve)
	guesses
}

def isGoodEnough(guess:Double, x:Double) = math.abs((guess * guess - x)/x)< 0.0001

println(sqrtStream(4).filter(isGoodEnough(_, 4)).take(10).toList)