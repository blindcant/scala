def double(x: Int): Int = x * 2
println(double(2))
println("A function's signature is the name, inputs, and output.")
println("A function's type is its inputs and its return value type, which is arranged like 'inputs => output'")
// This is an invokable value, it has the same result as invoking double
val aDouble: (Int) => Int = double
