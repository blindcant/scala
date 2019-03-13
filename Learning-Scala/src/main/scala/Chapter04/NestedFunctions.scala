def max(a: Int, b: Int, c: Int) = {
	// Define an internal nested function
	def max(x: Int, y: Int) = if (x > y) x else y
	// Return the maximum of a, b, or c.
	max(a, max(b, c))
}

println(max(42, 181, 19))
println(max(99, 1, 55))
