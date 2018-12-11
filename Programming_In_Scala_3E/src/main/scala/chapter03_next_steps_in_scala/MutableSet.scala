package chapter03_next_steps_in_scala

import scala.collection.mutable

object MutableSet extends App {
	val movieSet =  mutable.Set("Hitch", "Poltergeist")
	// +=  is actually a method for mutable sets.
	movieSet += "Shrek"
	println(movieSet)
}
