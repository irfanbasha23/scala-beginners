package Part1Basics

object StringOps extends App{

  val aString = "Hello, I am learning scala"

  println(aString.charAt(2)) // Strings are zero index, returns char 2

  println(aString.substring(7,11)) // 7 inclusive and 11 exclusive

  println(aString.split(",").toList) // split the string by comma

  println(aString.startsWith("Hello")) // starts with

  println(aString.replace(" ","-")) // replace " " with -

  println(aString.toUpperCase) // To Upper case

  println(aString.length) // length of the string

  // Scala specific function

  val aNumberString = "42"
  val aInt = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')

  println(aNumberString.reverse) // reverse the string

  println(aString.take(4)) // first 4 chars

  println(aString.takeRight(4)) // take last 4 chars

  println(aString.takeWhile(_ == 'l')) // takes all the chars until the condition met

  // String interpolation

  val name = "irfan"
  val age = 12
  val greeting = s"Hello, My name is $name and I am $age years old"
  println(greeting)
  val greeting2 = s"Hello, My name is $name and I am ${age+1} years old" // evaluating the expr inside the string
  println(greeting2)

  // F interpolation
  val speed = 1.2f
  val greeting3 = f"$name%s can eat $speed%2.3f burgers per minute" //2.2f means atleast 2 char in totals and 2 decimals
  println(greeting3)

  val x = 1.1f
  //val z = f"$x%3d" // This ill throw an error here. as x is float but we are converting it into digit integer

  // raw interpolator

  println(raw"The raw interpolated \n string \n") // raw interpolation will print strings as is


}
