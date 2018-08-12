package chapter02_getting_started

/**
	* <h1>ScratchPad</h1>
	* <p>
	* This program
	* </p>
	* <p>
	* tags:	<insert concept tags here for training code only>
	* </p>
	*
	* @author blindcant
	* @version 0.1.0 - 2018-08-12
	*/
object ScratchPad extends App {
	// var is variable
	var result = 1 + 2
	println("1 + 2 = " + result)
	print(result + " *= 3 is ")
	result *= 3
	println(result)

	// val is a constant
	// Type inference is being used here since there is no explicit type declaration
	val message = "Hi you guys. I am a constant using type inference. The compiler is figuring out what I am."
	println(message)

	// Explicit type declaration being used here.
	var anotherMessage: java.lang.String = "Hi you guys. I am a variable with an explicit type that doesn't use simple names."
	println(anotherMessage)

	var anotherMessage2: String = "Hi you guys. I am a variable with an explicit type that uses simple names because all java.lang classes are visible."
	println(anotherMessage2)

	def max(x: Int, y: Int): Int = {
		if (x > y) x
		else y
	}

	println("max(3, 5) is " + max(3, 5))
}
