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

println(for( b <- books if b.title.indexOf("Structute") >= 0) yield b.title)

println({for {
	b1 <- books
	b2 <- books
	if b1.title < b2.title
	a1<- b1.authors
	a2<- b2.authors
	if (a1==a2)
} yield a1})