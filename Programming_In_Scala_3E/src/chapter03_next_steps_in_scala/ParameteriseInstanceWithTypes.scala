package chapter03_next_steps_in_scala

object ParameteriseInstanceWithTypes extends App {
	// Don't create arrays this way!
	val greetingStrings = new Array[String](5)

	greetingStrings(0) = "Hello"
	greetingStrings(1) = ", "
	greetingStrings(2) = "World"
	greetingStrings(3) = " from"
	greetingStrings(4) = " array!"

	for (i <- 0 to 4)
		print(greetingStrings(i))
}
