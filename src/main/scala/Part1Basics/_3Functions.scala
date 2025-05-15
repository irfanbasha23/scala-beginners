package Part1Basics

object _3Functions extends App {

  def function(name: String, age: Int): String = {
    name + " " + age
  }

  println(function("Hello", 3))

  // A parameter less function can be called without paranthesis provided
  // method def should not have paranthesis
  // ********** Note ********************
  //There are generally two conventions for using parameter less method. One is when there are not any parameters. Second one is when method does not change the mutable state.
  // One must avoid the invocations of parameterless methods which look like field selections by defining methods that have side-effects with parenthesis
  def parameterListFunction(): Int = 42 // Zero Parameters Method which means there is one parameter list with 0 parameters

  def printMessage = println("This is parameter less function") // Parameterless function

  // One of the main advantage of having 2 types of functions is Currying.
  // Currying is a concept where a function more than 1 parameter list like def a(b: Int)(c: String)
  println(parameterListFunction()) // Valid
  //OR
  //println(parameterListFunction) // Invalid
  printMessage // Valid

  // *****
  def aRepeatedFunction(aString: String, number: Int): String = {
    if (number == 1) aString
    else aString + aRepeatedFunction(aString, number - 1)
  }

  println(aRepeatedFunction("Hello", 5))
  // ALWAYS USE RECURSION INSTEAD OF LOOPS, NEVER WRITE IMPERATIVE CODE IN SCALA SYNTAX
  // Compiler is smart enough to figure out the return type, even if its not mentioned
  // But you SHOULD mention return type if it is a recursive function

  // **** AUxilary Functions
  // You can def function inside a function
  def aBigFunction(aInt: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(aInt, aInt - 1)
  }

  println(aBigFunction(10))

  // 1. Two params, name and age, print a message
  def printMessage(name: String, age: Int): String = "Hi I am " + name + " and I am " + age + " old"

  println(printMessage("Irfan", 30))

  // 2. factorial function
  def factorial(number: Int): Int = {
    if (number <= 0) 1
    else number * factorial(number - 1)
  }

  println(factorial(5))

  // Fibonacci function
  def fibonacci(number: Int): Int = {
    if (number <= 2) return 1
    else fibonacci(number - 1) + fibonacci(number - 2)
  }

  println(fibonacci(10))

  // Test if a number is prime
  def checkPrimeNumber(number: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) false
      else number % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(number / 2)
  }

  println(checkPrimeNumber(8))
}
