package Part1Basics

object _2Expressions extends App {

  val x = 1 + 2 // (1+2) is called as expression, compiler will figure out the type
  println(x)

  println(2 + 3 * 4) // Match expressions Ans: 14

  //Math Operator are + - * / & | ^ <<(LS) >>(RS) >>>(Right Shift with 0 extension)

  println(1 == 3) // false
  println(2 != 2) // false
  var y = 100
  y += 3 // Side Effetcs, only works on var
  println(y)

  // Instructions vs Expressions
  // Instruction is command to computer DO something, Expression contains a value

  // IF expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 6 // IF here is an EXPRESSSION not a INS, Instead of telling
  // computer to do something, we are returing some value
  println(if (aCondition) 5 else 6)
  println(aConditionValue)

  // LOOPS, It is dicouraged to use loops in scala, there are part of imperative programming languages like scala
  // They dont return anything. only execute side effects
  var i = 0;
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN
  // SCALA forces everything to be a EXPRESSION that holds a value
  val aAssignment = (i = 20) // Even the assigment is an expression which has type of UNIT = void in java
  println(aAssignment) //()

  // Examples of side effects are println, loops, reassignments

  // **************** CODE BLOCKS ***************************

  val aCodeBlock = { // This is a code block, also an expression , the value of a code block is the type of the last expression
    val x = 10 // Scope of the vals are limited to code block
    val y = 20
    val z = x + y
    if (z > 30) "Hello" else "Goodbye"
  }

  // What is the doff between "Hello World" and println("Hello World") // String and Unit
  // What is the value of val someValue = { 2 < 3 }
  val someValue = {
    2 < 3
  }
  println(someValue) // true
  // What is the value of
  val someOtherValue = {
    if (someValue) 234 else 43 // Irrelevant
    100
  }
  println(someOtherValue) // 100
}
