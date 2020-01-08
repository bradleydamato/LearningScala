package lectures.part1basics

object CBVvsCBN extends App{
  def CallByValue(x: Long): Unit = {
    println("by val " + x)
    println("by val " + x)
  }
  def CallByName(x: => Long): Unit = {
    println("by name " + x)
    println("by name " + x)



  }
  CallByValue(System.nanoTime())
  CallByName(System.nanoTime())
}
