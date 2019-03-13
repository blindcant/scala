// Input multiple arguments that are stored in an array
def sum(items: Int*): Int = {
	var total = 0
	for (i <- items)
		total += i
	total
}

println("The sum of 1, 2, and 3 is " + sum(1, 2, 3))
