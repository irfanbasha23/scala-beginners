package Part1Basics

object _6CallByValueCallByName extends App {

  def callByValue(x: Long): Unit = {
    println("by Value:"+ x) //by Value:1055634698054693
    //println("by Value:"+ 1055634698054693)
    println("by Value:"+ x) //by Value:1055634698054693
    //println("by Value:"+ 1055634698054693)
  }

  def callByName(x: => Long): Unit = { // => is the indicator to define it as by name
    println("by Name:" + x) //by Name:1055634701792702
    //println("by Name:" + System.nanoTime()) as is the expression is passed.
    println("by Name:" + x) //by Name:1055634701851734
    //println("by Name:" + System.nanoTime()) as is the expression is passed.
  }

  callByValue(System.nanoTime()) // The parameter expression is evaluated before calling the method
  callByName(System.nanoTime()) // The lazy evaluation happens here. The expression itself will be passed and evaluated when needed.

  // ANOTHER EXAMPLE
  def infinite(): Int = 1 + infinite() // Infinite recursion
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(),34) // Since, infinite() method is passed as by value, the infinite() will evaluated before calling the method.
                              // which will crash.
  printFirst(34,infinite()) // In this case, we are passing infinite() method as by name, which will be evaluated when required. which is never in this case.

  /**
   * call by value -> Value is computed before call, the same value is used everywhere
   * call by name => expression is passed literally, expression is evaluated at every use within
   */
}
