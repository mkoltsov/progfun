import scala.io.Source

val in = Source.fromUrl("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt")

val words = in.getLines

val mnem = Map('2'->"ABC", '3'->"DEF")