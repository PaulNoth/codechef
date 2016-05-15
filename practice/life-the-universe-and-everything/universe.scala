import scala.io.Source

object Main extends App {
  var num = readInt()
  while(num != 42)  {
    println(num)
    num = readInt()
  }
}