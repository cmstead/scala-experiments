import scala.language.postfixOps
import scala.collection.mutable.HashMap

object Change {

	def makeChange (changeStore: HashMap[Int, Int]) (remainder: Int, coinValue: Int): Int = {
		changeStore(coinValue) = remainder / coinValue
		remainder % coinValue
	}

	def main (args: Array[String]): Unit = {
		val amount = args.isEmpty match {
			case false => args(0) toInt
			case _ => 0
		}
		
		val coins = List(25, 10, 5, 1)
		var changeMap = new HashMap[Int, Int]
		coins.fold(amount) { makeChange(changeMap) }
		
		println(changeMap toString)
	}
}