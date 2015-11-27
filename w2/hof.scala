def sumInts(a:Int, b:Int):Int= if (a>b) 0 else a+sumInts(a+1, b)

println(sumInts(1,10))

def cube(x:Int) = x*x*x

def sumCubes(a:Int, b:Int):Int = if (a>b) 0 else cube(a)+sumCubes(a+1, b)

println(sumCubes(1,10))

def sum(f:Int => Int, a:Int, b:Int):Int = if (a>b) 0 else f(a) + sum(f, a+1, b)

def idClos(x:Int):Int = x
def cubeClos(x:Int):Int = x*x*x

def sumIntsHOF(a:Int, b:Int) = sum(idClos, a,b)
def sumCubesHOF(a:Int, b:Int) = sum(cubeClos, a,b)

println(sumIntsHOF(1,10))
println(sumCubesHOF(1,10))

def idAnonClos = (x:Int) => x
def cubeAnonClos = (x:Int) => x*x*x
def sum = (x:Int, y:Int) => x+y

def sumIntsHOFAnon(a:Int, b:Int) = sum((x)=>x, a,b)
def sumCubesHOFAnon(a:Int, b:Int) = sum((x)=>x*x*x, a,b)
println(sumIntsHOF(1,10))
println(sumCubesHOF(1,10))