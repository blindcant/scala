

def power(n: Int, e: Int): Long = {
	if (e >= 1) {
		// iterate over e until it is less than 1
		n * power(n, e - 1)
	}
	else {
		1
	}
}

println(power(2, 8))
println(power(2, 1))
println(power(2, 0))