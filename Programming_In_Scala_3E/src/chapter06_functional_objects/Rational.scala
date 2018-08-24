package chapter06_functional_objects

class Rational(n: Int, d: Int) {
	// Any code not inside a method or field definition is run during object construction.
	//println("Created rational number as numerator " + numerator + " and denominator " + denominator)

	// A primary constructor precondition that places constraints on the constructor's parameters
	require(d != 0)

	val numerator: Int = n
	val denominator: Int = d

	// Over riding Java's Object.toString
	override def toString = numerator + "/" + denominator

	def add(rationalObject: Rational): Rational = {
		new Rational(
			// New numerator
			numerator * rationalObject.denominator +
			rationalObject.numerator * denominator,
			// New denominator
			denominator * rationalObject.denominator
		)
	}
}

object Rational extends App {
	val oneHalf = new Rational(1, 2)
	println(oneHalf.toString)

	val twoThirds = new Rational(1, 2)
	println(twoThirds.toString)

	println(oneHalf add twoThirds)
	// Throws IllegalArgumentException because of the constraint
	//val rational2 = new Rational(1, 0)
}