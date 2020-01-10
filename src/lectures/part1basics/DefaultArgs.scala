package lectures.part1basics

object DefaultArgs extends App{

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <=1) acc
    else trFact(n-1,n*acc)

  val fact10 = trFact(10)

  def savePicture(formart: String = "jpg", width: Int, height: Int): Unit = println("saving")
  savePicture(width = 800, height = 800)




}
