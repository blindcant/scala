/*
An identifier function simply returns whatever is passed to it.
The T (type) is defining the type as a parameter which is set by the caller. The value of this is that the return type
will be the same as what was passed in.
*/

def identifier[T](input: T): T = input

val result = identifier[String]("Hi")
println(result)
println(result.getClass)

// Using type inference to stop explicit type statement
val result2 = identifier(8)
println(result2)
println(result2.getClass)

// The return type here will be Any, not what was passed. Run this in REPL to see.
def identifierAny(input: Any): Any = input

val result3 = identifierAny("Hi")
println(result3)
println(result3.getClass)

val result4 = identifierAny(8)
println(result4)
println(result4.getClass)