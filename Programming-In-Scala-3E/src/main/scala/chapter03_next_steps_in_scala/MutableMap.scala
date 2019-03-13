package chapter03_next_steps_in_scala
import scala.collection.mutable

object MutableMap extends App {
	// Initialise an empty Map. Explicit typing is used because no values are being passed to be used for type inference.
	val treasureMap =  mutable.Map[Int, String]()
	// Add the key / value pairs
	// 1) The -> method returns a tuple containing the key and value
	// 2) the += method adds the tuple to the map
	treasureMap += (1 -> "Go to island.")
	treasureMap += (2 -> "Find big X on the ground.")
	treasureMap += (3 -> "Dig.")

	println(treasureMap(2))
}
