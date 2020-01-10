package lectures.part1basics

object recursion extends App{
  def aFactorialFunction(n: Int): Int =
    if (n == 1) n
    else {
      println("computing factorial of" + n + "but first need factorial of" + (n-1))
      val result = n * aFactorialFunction(n - 1)
      println(("computed factorial of " + n))
      result
    }


  def tailFactorial(n: BigInt): BigInt = {
    @scala.annotation.tailrec
    def factHelper(x: BigInt, accum: BigInt): BigInt =
      if (x<=1) accum
      else factHelper(x - 1,x * accum) // tail recursion
    factHelper(n,1)


  }
  //why does the above not crash?
  //The reason:
  println(tailFactorial(10000))
  def TailConcat(s: String,n: Int, acc: String): String = {
    if (n <= 0) acc
    else TailConcat(s, n-1, s + acc)





  }
  println(TailConcat("hello",1000,""))
  def TailIsPrime(n: Int ): Boolean = {
    def isPrimeUntil(t: Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if (t <= 1) true
      else isPrimeUntil(t - 1, n % t != 0 && isStillPrime)
    isPrimeUntil(n/2, true)
  }

  println(TailIsPrime(2003))
  println(TailIsPrime(629))
  println(TailIsPrime(2003))
}
//WHEN LOOPS ARE NEEDED USE TAIL RECURSION
