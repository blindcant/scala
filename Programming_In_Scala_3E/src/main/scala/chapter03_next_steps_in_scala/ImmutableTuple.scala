package chapter03_next_steps_in_scala

object ImmutableTuple extends App {
	// Create a tuple
	val pair = (99, "Luftballons")
	// Tuples start at 1
	println(pair._1)
	println(pair._2)
}
