package lectures.part1basics

object expressions extends App {
  val x = 1+2 //expression, obviously
  println(x)

  println(2+3*4)

  println(1 == x)

  var aVariable = 3
  // changing a variable is a side effect
  //instructions(DO) vs expressions (value)
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)

  var i = 0
  val aWhile = while (i< 10) {
    println(i)
    i +=1
  }
  //NEVER DO THIS AGAIN
  //EVERYTHING IN SCALA IS A DEFINITION
  val aWeirdValue = (aVariable = 3) // UNIT == void
  println(aWeirdValue)

  //side effects, printing, whiles, reassigning

  //code blocks
  val aCodeBlock = {
    val y = 2
    val z = y +1

    if (z>2) "hello" else "goodbye"

  }
  // difference between "hello word" and println("hello world")
  // first = str, second = Unit
  val someValue = {
    2<3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42 // this is what someOtherValue is equal to

  }
}
