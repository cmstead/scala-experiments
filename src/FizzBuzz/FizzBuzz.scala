import scala.language.postfixOps

object FizzBuzz {

	def fizzBuzz (x: Int): String = {
		return (x % 3, x % 5) match {
			case (0, 0) => "FizzBuzz"
			case (0, z) => "Fizz"
			case (y, 0) => "Buzz"
			case _ => x toString
		}
	}

	def main (args: Array[String]): Unit = {
		1 to 100 map fizzBuzz foreach { println(_) }
	}

}