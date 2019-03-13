package chapter03_next_steps_in_scala

object CreatingArrays extends App {
	// This is calling a factory method named apply which returns an array.
	val numbers = Array("zero", "one", "two")
	val numbers2 = Array.apply("zero", "one", "two")

	for (number <- numbers)
		println("number is currently " + number)

	for (number <- numbers2)
		println("number is currently " + number)
}
