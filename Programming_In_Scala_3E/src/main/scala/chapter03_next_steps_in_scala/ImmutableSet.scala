package chapter03_next_steps_in_scala

object ImmutableSet extends  App {
	// Create a set
	var jetSet = Set("Boeing", "Airbus")
	// The same as above, but explicitly states the factory method name
	var jetSet2 = Set.apply("Boeing", "Airbus")
	// Concatenate a value to a set, a new set is returned
	jetSet += "Lear"
	// Same as above
	jetSet2 = jetSet2 + "Lear"
	println(jetSet)
	println(jetSet2)
	// Check if the set contains an element
	println(jetSet.contains("Cessna"))
}
