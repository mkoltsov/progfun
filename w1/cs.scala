def and(x:Boolean, y: => Boolean) = if (x) y else false

println(and(true, false))
println(and(false, true))
println(and(true, true))