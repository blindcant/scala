package chapter03_next_steps_in_scala

object ImmutableMap extends App {
	// Type inference can be used because values are being passed during the Maps construction.
	val romanNumeral = Map(
		1 -> "I",
		2 -> "II",
		3 -> "III",
		4 -> "IV",
		5 -> "V"
	)

	println(romanNumeral)
}
