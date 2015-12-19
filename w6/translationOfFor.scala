def mapFun[T,U](xs:List[T], f:T => U): List[U] = for (x<-xs) yield f(x)
//def flatMap[T,U](xs:List[T], f:T => U): Iterable[U] = for (x<-xs; y<- f(x)) yield y
//def filter[T,U](xs:List[T], p:T => U): List[U] = for (x<-xs if p(x)) yield x

val ls = List("Apples", "Oranges", "Peers", "Tomatoes")

val lsF = ls.withFilter(_.startsWith("A"))

println(mapFun(ls, (x:String) => s"${x} is a vegetable"))

case class Book(title:String, authors:List[String])

val books:Set[Book] = Set(Book(title="Structute", authors=List("Chef", "Pupa")),
	Book(title="Intro", authors=List("Duma", "Dima")),
	Book(title="Intro1", authors=List("Duma1", "Dima")),
	Book(title="Intro2", authors=List("Duma2", "Dima")),
	Book(title="Intro3", authors=List("Duma3", "Dima")),
	Book(title="Intro4", authors=List("Duma4", "Dima")),
	Book(title="Intro5", authors=List("Duma5", "Dima")),
	Book(title="Intro6", authors=List("Duma6", "Dima")),
	Book(title="Intro7", authors=List("Duma7", "Dima")),
	Book(title="Intro", authors=List("Duma8", "Dima")))
	

println(books)

println(for( b <- books; a<-b.authors if a.startsWith("Chef")) yield b.title)

println(books.flatMap(x => x.authors).filter(_.startsWith("Chef")).map(x.title))