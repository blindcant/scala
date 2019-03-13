package chapter02_getting_started
/**
	* <h1>VariablesAndConstants</h1>
	* <p>
	* This program shows the difference between var and val, or variables and constants.
	* </p>
	* <p>
	* tags:	var; val; type inference;
	* </p>
	*
	* @author blindcant
	* @version 0.1.0 - 2018-08-12
	*/
object VariablesAndConstants extends App {
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
}
