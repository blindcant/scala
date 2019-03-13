def power(x: Int, n: Int):Long = {
	if (n >= 1)
		x * power(x, n - 1)
	else
		1
}

println(power(2, 0))
println(power(2, 1))
println(power(2, 2))