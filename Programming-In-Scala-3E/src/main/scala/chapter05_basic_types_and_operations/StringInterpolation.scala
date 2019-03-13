package chapter05_basic_types_and_operations

class StringInterpolation {

	def printMessages(): Unit = {
		val message = "Hello"
		println(s"$message world!")
		println(s"6 * 7 is ${6 * 7}")
		println(raw"The raw string interpolator print's with\nno\tescapes")
		println("The f string interpolator is like C's printf function.")
		println(f"${math.Pi}%.5f")
	}

}

object StringInterpolation extends App {
	val stringInterpolation = new StringInterpolation
	stringInterpolation.printMessages()
}