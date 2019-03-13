package chapter06_functional_objects

class Rational(n: Int, d: Int) {
	// Any code not inside a method or field definition is run during object construction.
	//println("Created rational number as numerator " + numerator + " and denominator " + denominator)

	// A primary constructor precondition that places constraints on the constructor's parameters
	require(d != 0)

	private val greatestCommonDivisor = gcd(n.abs, d.abs)
	val numerator: Int = n
	val denominator: Int = d

	// An auxillary constructor that is chained to the primary constructor
	def this(n: Int) = {
		this(n, 1)
	}

	// Over riding Java's Object.toString
	override def toString = numerator + "/" + denominator

	def + (rationalObject: Rational): Rational = {
		new Rational(
			// New numerator
			numerator * rationalObject.denominator +
			rationalObject.numerator * denominator,
			// New denominator
			denominator * rationalObject.denominator
		)
	}

	def + (integerObject: Int): Rational = {
		new Rational(
			numerator + integerObject * denominator,
			denominator,
		)
	}

	def - (rationalObject: Rational): Rational = {
		new Rational(
			// New numerator
			numerator * rationalObject.denominator -
				rationalObject.numerator * denominator,
			// New denominator
			denominator * rationalObject.denominator
		)
	}

	def - (integerObject: Int): Rational = {
		new Rational(
			numerator - integerObject * denominator,
			denominator,
		)
	}

	def * (rationalObject: Rational): Rational = {
		new Rational(
			numerator * rationalObject.numerator,
			denominator * rationalObject.denominator
		)
	}

	def * (integerObject: Int): Rational = {
		new Rational(
			numerator * integerObject,
			denominator,
		)
	}

	def / (rationalObject: Rational): Rational = {
		new Rational(
			numerator * rationalObject.denominator,
			denominator * rationalObject.numerator
		)
	}

	def / (integerObject: Int): Rational = {
		new Rational(
			numerator,
			denominator * integerObject
		)
	}

	def lessThan(that:Rational) = {
		this.numerator * that.denominator < that.numerator * this.denominator
	}

	private def gcd(a: Int, b: Int): Int = {
		if (b == 0) {
			a
		}
		else {
			gcd(b, a % b)
		}
	}
}

object Rational extends App {
	// Needed for implicit conversion to happen automatically.
	// This needs to be here so it is in scope, otherwise it is an error.
	implicit def intToRational(i: Int) = new Rational(i)

	val oneHalf = new Rational(1, 2)
	println(oneHalf.toString)

	val twoThirds = new Rational(2, 3)
	println(twoThirds.toString)

	println(oneHalf + twoThirds)
	println(oneHalf * twoThirds)
	println(2 * oneHalf)

	// Throws IllegalArgumentException because of the constraint
	//val rational2 = new Rational(1, 0)
}