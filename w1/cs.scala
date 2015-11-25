//call by value + call by name
def and(x:Boolean, y: => Boolean) = if (x) y else false

println(and(true, false))
println(and(false, true))
println(and(true, true))

def loop:Boolean = loop
// call by name
def a = loop
// call by value
//val b = loop