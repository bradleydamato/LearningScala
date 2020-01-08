package lectures.part1basics

object functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello",3))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello",3))

  def aBigFunction(n: Int): Int  = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)

  }
//WHEN YOU NEED LOOPS USE RECURSION
  //DONT USE IMPERATIVE CODE
//Doing assigned function practice
  def aGreetingFunction(name: String, age: Int): String = {
    val hi: String = "Hi My Name Is"
    val and: String = "and I am "
    val old: String = "old"
    hi+" "+name+" "+and+" "+age+" "+old
  }
  println(aGreetingFunction("brad",23))
  def aFactorialFunction(n: Int): Int = {
    if (n == 1) n
    else n * (aFactorialFunction(n-1))

  }
  println((aFactorialFunction(5)))
  def aFibonacciFunction(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)

  }
  println(aFibonacciFunction(8))
  def aPrimeChecker(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)



  }
  println(aPrimeChecker(37))
  println(aPrimeChecker(16))
}
