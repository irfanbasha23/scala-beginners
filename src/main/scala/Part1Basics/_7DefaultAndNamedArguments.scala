package Part1Basics

object _7DefaultAndNamedArguments extends App {

  def tailRecFactorial(n: Int,acc: Long = 1) : Long = {
    if (n <= 1) acc
    else tailRecFactorial(n-1,n*acc)
  }

  /**
   * For any factorial, we need to pass 1 as accumulator which is unnecessary.
   * we can use default arguments.
   */
  println(tailRecFactorial(10))

  println(tailRecFactorial(10,3))

  /**
   * The problem is that you only define default arguments in the end. But not the leading arguments.
   * To solve this we have 2 solutions
   * 1. Always use default argument in the end
   * 2. Use named arguments
   */

  def savePicture(format: String, width: Int,height: Int) : Unit = println("saving picture")

  savePicture(format = "jpeg",width = 200,height = 300) // Named arguments
}
