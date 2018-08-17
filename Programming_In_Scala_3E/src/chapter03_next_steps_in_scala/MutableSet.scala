package chapter03_next_steps_in_scala

import scala.collection.mutable

object MutableSet extends App {
	val movieSet =  mutable.Set("Hitch", "Poltergeist")
	// Shorthand for movieSet = movieSet + "Shrek"
	movieSet += "Shrek"
	println(movieSet)
}
