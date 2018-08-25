package chapter03_next_steps_in_scala

object ImmutableList extends App {
	// List.apply(...) is a factory method.
	val oneTwoThree = List(1, 2, 3)
	// Create a new list using cons and Nil
	// :: is a method called cons, which prepends a new element to be beginning of an existing list and returns the new list
	val oneTwo = 1 :: 2 :: Nil
	val threeFour = List(3, 4)
	/*
	If a method is used in operator notation then the method is invoked on the left operand
	If the method name ends in a colon, the method is invoked on the right operand
	 */
	// List has a method named ::: for concatenating lists
	val oneTwoThreeFour = oneTwo ::: threeFour
	println(oneTwo + " and " + threeFour + " were not mutated.")
	println("Thus, " + oneTwoThreeFour + " is a new list.")

	// In this case a list is being prepended to another lists's values
	val oneTwoThreeFour2 = oneTwo :: threeFour
	// Adding Nil makes the second list be prepended as a list
	val oneTwoThreeFour3 = oneTwo :: threeFour :: Nil
	println(oneTwoThreeFour2)
	println(oneTwoThreeFour3)
}
