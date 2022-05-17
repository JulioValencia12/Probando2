import scala.io.StdIn.readLine

object main extends App {

  print("Enter your first name: ")
  val firstName = readLine()

  print("Enter your last name: ")
  val lastName = readLine()

  println(s"Your name is $firstName $lastName")

  print("Enter your age: ")
  val age = readLine()

  override def toString(): String = s"$firstName $lastName is $age years old"
  def printFullName(): Unit = println(this)
  printFullName()

  println("Fin (?)")
}




