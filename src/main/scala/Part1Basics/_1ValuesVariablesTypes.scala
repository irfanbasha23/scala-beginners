package Part1Basics

object _1ValuesVariablesTypes extends App {

  val x = 100 //(val/var) variablename : Type(Optional) = value
  // Compiler can inter TYPE. Its smart enough to identify. But if you use type, compiler will throw error
  // If the type doesnot math
  println(x)
  //x = 200;
  // VALS ARE IMMUTABLE similar to const and final

  val s: String = "Hello, This is a string"; //Semicolon is not mandatory if there is only one expression

  val bool: Boolean = true

  val char: Char = 'A'

  val int: Int = 100
  //val s: Short = 46133432 , Too big for short
  val l: Long = 124212
  val f: Float = 12.34f
  val d: Double = 123.232d

  // **************** VARIABLES ***********************
  var variable: Int = 123
  variable = 345 // compiler wont complain here, side effects
}
