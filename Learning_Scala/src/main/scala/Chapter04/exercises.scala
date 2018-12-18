def printInfoMessage(s: String): Unit = println("\n[INFO] " + s + "\n")

printInfoMessage("Question 1")

def getArea(r: Double): Double = {
	Math.PI * r * r
}

println(getArea(1))
println(getArea(2))

printInfoMessage("Question 2")

def getAreaString(r: String): String = {
	(Math.PI * r.toDouble * r.toDouble).toString
}

println(getAreaString("1"))
println(getAreaString("2"))
// Empty string causes an exception
// println(getAreaString(""))

def printFivesTailRecursive(number: Int, threshold: Int): Unit = {

	if (number > threshold) {
		return
	}

	// Placement here prints ascending
	if (number % 5 == 0) {
		println(number)
	}
	printFivesTailRecursive(number + 1, threshold)
	// Placement here prints descending
}

def printFivesTailRecursive2(number: Int, threshold: Int): Int = {

	if (number > threshold) {
		return 0
	}

	if (number % 5 == 0) {
		println(number)
	}
	printFivesTailRecursive2(number + 1, threshold)

}

printInfoMessage("Question 3")
printFivesTailRecursive(1, 50)
printFivesTailRecursive2(1, 50)

printInfoMessage("Question 4")

def expandMilliseconds(milliseconds: Long): String = {

	var totalSeconds = milliseconds / 1000
	var seconds = totalSeconds % 60
	var minutes = totalSeconds / 60 % 60
	var hours = totalSeconds / 60 / 60

	return milliseconds + " milliseconds is -> " + hours + " hours & " + minutes + " minutes & " + seconds + " seconds"
}

println(expandMilliseconds(1000)) //1 second
println(expandMilliseconds(30000)) //30 seconds
println(expandMilliseconds(60000)) //1 minute
println(expandMilliseconds(1800000)) //30 minutes
println(expandMilliseconds(3600000)) //1 hour
println(expandMilliseconds(86400000)) //1 day

printInfoMessage("Question 5")

def exponent(n: Int, e: Int): Double = {
	math.pow(n, e)
}

def exponent2(n: Int, e: Int): Double = {
	if (e >= 1)
		n * exponent2(n, e - 1)
	else
		1
}

@annotation.tailrec
def exponent3(n: Double, e: Int, t: Double = 1): Double = {
	if (e < 1)
	// Return t, which starts at 1 but holds the result of the previous recursion as well.
		t
	else
	// Move the multiplication inside of the function so it can be tail recursive
		exponent3(n, e - 1, n * t)
}

println(exponent(2, 0))
println(exponent(2, 1))
println(exponent(2, 2))
println(exponent(2, 32))
println(exponent(2, 64))

println(exponent2(2, 0))
println(exponent2(2, 1))
println(exponent2(2, 2))
println(exponent2(2, 32))
println(exponent2(2, 64))

println(exponent3(2, 0))
println(exponent3(2, 1))
println(exponent3(2, 2))
println(exponent3(2, 32))
println(exponent3(2, 64))

printInfoMessage("Question 6")
/*
https://www.mathsisfun.com/algebra/distance-2-points.html

x,y
0,0 is middle
1,1 is 1 right and 1 up
-1,-1 is 1 left and 1 down


distance = square root of ( (point 1 X coordinate - point 2 x coordinate) ^ 2 + (point 1 Y coordinate - point 2 Y coordinate) ^ 2 )

 */

val point1 = (9, 7)
val point2 = (3, 2)

/**
	* Calculates he distance between 2 points.
	*
	* @param point1 - x, y coordinates
	* @param point2 - x, y coordinates
	*/
def pointsDistance(point1: (Int, Int), point2: (Int, Int)): Double = {
	math.sqrt(math.pow(point1._1 - point2._1, 2) + math.pow(point1._2 - point2._2, 2))
}

println(pointsDistance((9, 7), (3, 2)))
println(pointsDistance((-3, 5), (7, -1)))

printInfoMessage("Question 7")

def returnTuple(tuple: (Any, Any)): (Any, Any) = {

	if(tuple._1.isInstanceOf[Int]) {
		(tuple._1, tuple._2)
	}
	else if (tuple._2.isInstanceOf[Int]) {
		(tuple._2, tuple._1)
	}
	else
		tuple
}

println(returnTuple(('A', 2)))
println(returnTuple(('A', 'B')))
println(returnTuple((1, 'B')))

printInfoMessage("Question 8")

def returnTuple2(tuple: (Any, Any, Any)): (Any, String, Any, String, Any, String) = {
	(tuple._1, "\"" + tuple._1.toString + "\"", tuple._2, "\"" + tuple._2.toString + "\"", tuple._3, "\"" + tuple._3.toString + "\"")
}

println(returnTuple2(('A', 2, 'C')))
println(returnTuple2(('A', false, 3)))
println(returnTuple2((1, 'B', true)))