package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala "

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split( " ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)
  
  val StringNumber = "5"
  val IntNumber = StringNumber.toInt

  println("a" +: StringNumber :+ "z")
  println(str.reverse)
  println(str.take(2))

  // S Interpolators
  val name = "dave"
  val age = 12
  val greeting = s"Hello, my name is $name and I am ${age+1} years old"
  println(greeting)

  //f interpolator
  val speed =  1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  //raw interpolator
  println(raw"this is a \n new line")
  val escaped = "This is a \n new line"
  println(raw"$escaped")

  



  

}
