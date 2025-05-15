package Part2OOPS

import javax.security.sasl.AuthorizeCallback

object OOBasics extends App {

  val person = new Person("Jhon",26)

  println(person.age)
  person.greet("irfan")
  person.greet2("Irfan")
  person.greet3()

  val author = new Author("Jhon","Doe",1990)
  val novel = new Novel("ABC",2020,author)
  println(novel.authorAge) // 30
  println(novel.isWrittenBy(author)) // true
}

// name and age are class parameters. you can not access them as person.age
// You need to convert them into class members.
// Way to convert class parameters to class members by adding val
// CLASS PARAMS and CLASS MEMBERS are different
class Person(name: String,val age: Int) {
 // body
 // implementation of the class,it can have val,var definitions, expressions, packages, functions

  val x = 2 // I can access person.x
  println(x + 3) // As you can see the output, it prints 5 first and then 26. which means
                // whenever a new keyword is used, the class block is executed first

  def greet(name: String): Unit = println(s"$name says, Hi, $name") // Irfan says, Hi, irfan
  def greet2(name: String): Unit = println(s"${this.name} says, Hi, $name") // Jhon says, Hi, Irfan
  // Since the method has the same param as constructor param, to differentiate both, we need to use 'this'
                                            // To access constructor parameters in the class block, use 'this'

  def greet3():Unit = println(s"Hi, I am $name") //Hi, I am Jhon

  //def greet3():Int = 42 // same method name but different return type, compiler will complain
  def greet3(a: Int): Int = 43
  // method overloading - same method name, different no. of params, and different types of params and return types
  // return types alone

  /**
   * Multiple constructors or overloading of constructors or auxliary constructor
   */
  def this(name: String) = this(name, 0) // only useful in case of default params

  def this(age: Int) = this("", age)

  def this() = this("Jhon Doe")
}

/**
 * Exercises
 * 1. Novel and Writer class
 * 2. Author class - first name, surname, year of birth, fullname(): first_name+surname
 * 3. Novel - name, year, author : Author
 *          - authorAge
 *          - isWrittenBy(author)
 *          - copy(new year of release) = new instance of Novel
 */

class Author(firstName: String, surname: String,val yearOfBirth: Int) {
  def fullName: String = s"$firstName $surname"
}

class Novel(name: String,year: Int, author: Author) {
  def authorAge: Int = year - author.yearOfBirth
  def isWrittenBy(author: Author): Boolean = this.author == author
  def copy(newEditionYear: Int): Novel = new Novel(this.name,newEditionYear,this.author)
}

/**
 * 2. Counter class(int)
 * - return current count
 * - increment
 * - decrement
 * - overload inc/dec to receive an amount
 */
