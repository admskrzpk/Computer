
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
val filename = "C:\\projects\\Computer\\instructions.txt"
val fileContent = Source.fromFile(filename).getLines().flatMap(_.split("\\s+")).toList



case class Board(m: Int, n: Int) {
    val lista = ArrayBuffer[Char]()


    def create(symbol: Char, x: Int, y: Int) = {
        lista.addOne(symbol)
        this
    }

    override def toString = {
        s"${lista.mkString}"
    }

    def renderBoard(table: Array[Char]): Unit = {
        println(table.grouped(3).map(_.mkString(" ")).mkString("\n", "\n", " "))    }
}


val board = Board(4,3)
board.renderBoard(Array('_'))

val boardZSymbolem =  board
  .create('>',1,1)
  .create('v', 2,3)