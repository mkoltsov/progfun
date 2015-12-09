def assertAllPos[S <: AnyVal](r:S) = if (r != null) r else throw new IllegalArgumentException

println(assertAllPos(13))
println(assertAllPos(2.0))