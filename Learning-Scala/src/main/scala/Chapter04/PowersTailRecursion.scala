@annotation.tailrec
def power(x: Int, n: Int, t: Int = 1): Int = {
	if (n < 1)
		// Return t, which starts at 1 but holds the result of the previous recursion as well.
		t
	else
		// Move the multiplication inside of the function so it can be tail recursive
		power(x, n - 1, x * t)
}

println(power(2, 0))
println(power(2, 1))
println(power(2, 2))
println(power(2, 16))
