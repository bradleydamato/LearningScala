package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  // vals are immutable
  //val types can be inferred by compiler
  val aString: String = "hi";
  //semicolons are allowed but not necessary like in C++
  //except for multiple expression on a single line
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aShort: Short = 4613
  val aLong: Long = 4444444345345L
  val aFloat: Float = 3.1f
  val aDouble: Double = 3.1415


  //VARIABLES
  var aVariable: Int = 4
  aVariable = 5 // side effects



}
