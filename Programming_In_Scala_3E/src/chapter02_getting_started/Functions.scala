package chapter02_getting_started

/**
	* <h1>Functions</h1>
	* <p>
	* Showing how to use basic functions.
	* </p>
	* <p>
	* tags:	object; App; println; def; Unit;
	* </p>
	*
	* @author blindcant
	* @version 0.1.0 - 2018-08-12
	*/
object Functions extends App {
	// Function without parameters.
	// Unit is like Java void. There is nothing being returned.
	def greeting() : Unit = println("A parameter-less function. It has no return type, which is called Unit.")
	greeting()

	// Function with parameters
	def max(x: Int, y: Int): Int = {
		if (x > y) x
		else y
	}
	println("max(3, 5) is " + max(3, 5))

}
