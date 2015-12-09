// S <: T means :S is a subtype of T
// S >: T means :S is a supertype of T, or T is a subtype of S
def assertAllPos[S >: AnyVal <: Any](r:S):S = if (r != null) r else throw new IllegalArgumentException

println(assertAllPos(13))
println(assertAllPos(2.0))
println(assertAllPos(true))