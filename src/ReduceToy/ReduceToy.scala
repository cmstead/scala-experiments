import scala.language.postfixOps

object ReduceToy {

	def main (args: Array[String]): Unit = {
		
		val argset = args.isEmpty match {
			case false => args
			case _ => Array("0")
		}
		
		println(argset map { _ toFloat } reduce { (a: Float, b: Float) => { b / a } }) 
		
	}

}