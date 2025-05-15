package Part1Basics

import scala.annotation.tailrec

object _5Recursion extends App{

  def factorial(n: BigInt): BigInt = {
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + ": Need factorial of (n-1)" + (n - 1))
      val result = n * factorial(n-1)
      println("Computed factorial of "+ n + ": Need factorial of (n-1)"+ result)
      result
    }
  }
  //println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = { // Auxiliary Function
      if (x == 0) accumulator
      else factorialHelper(x-1,x*accumulator) // TAIL RECURSION -> Use the recursive call as the LAST expression
    }
    factorialHelper(n, 1)
  }
  // factorialHelper(10, 1) => factorialHelper(9, 10 * 1) => factorialHelper(8, 9 * 10*1) => factorialHelper(7, 8 * 9*10*1) ....
  // This works perfactly file, even though this is a recursion again. why? Auxiliary Function? NO!!!!
  println(anotherFactorial(5000))

  // INSTEAD OF LOOPS, USE TAIL RECURSION

  /**
   * 1. Conctanate string n times
   * 2. is Prime - tail recursive
   * 3. Fibonacci number - tail recursive
   */

  @tailrec
  def concatinateString(n: Int,acc: String, inputString: String) : String = {
    if (n < 1) acc
    else concatinateString(n-1,acc+inputString,inputString)
  }
  println(concatinateString(4,"","abc"))



  def fibonacciNumber(n: Int) : Int = {
    @tailrec
    def fiboTailRec(number:Int, acc1: Int,acc2: Int): Int = {
      if (number >= n) acc2
      else fiboTailRec(number+1,acc1+acc2,acc1)
    }

    if(n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }
  println(fibonacciNumber(3)) // 0 1 1 2 3 5 8 13

  def primeNumer(n:Int): Boolean = {
    @tailrec
    def isPrimeTailRec(number:Int,isStillPrime: Boolean) : Boolean = {
      if (!isStillPrime) false
      else if (number <= 1) true
      else isPrimeTailRec(number-1,n%number!= 0 && isStillPrime)
    }
    isPrimeTailRec(n/2,true)
  }
  println(primeNumer(69))
  println(primeNumer(2003))
}
