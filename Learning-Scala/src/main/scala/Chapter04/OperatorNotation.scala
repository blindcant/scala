/*
Scala has no numeric operators, they are actually methods for each type. They can be typed 2 ways, like a normal
arithmetic call with or with the dot notation method calls.
 */

val pi = Math.PI

// Dot notation
println(pi.*(2))
println(pi./(2))
// Infix operator notation
println(pi + 2)
println(pi - 2)

// Multiple parameter infix operator notation
println(1 + 2 + 3)
println(1.+(2).+(3))