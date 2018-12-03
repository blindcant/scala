def printInfoMessage(s: String): Unit =  println("\n[INFO] " + s + "\n")

printInfoMessage("Question 1")

val testString: String = "Some string"
println("match demo - trying to match \"" + testString + "\" with \"Some string.\"")

val matchResult = testString match {
	case "Some string." => println("Found.")
	case other => {
		println(s"$other didn't match.")
		// return code of -1
		-1
	}
}

printInfoMessage("Question 2")

val amount: Double = -1.0
if (amount == 0) println("Equals 0.") else if (amount < 0) println("Less than 0.") else println("Greater than 0.")

printInfoMessage("Question 3")

val colourName = "CYAN"
val matchResult2 = colourName.toLowerCase match {
	case "cyan" => println("#00ffff")
	case "magenta" => println("#ff00ff")
	case "yellow" => println("#ffff00")
	case other => {
		println(s"$other was not found.")
		// return code of -1
		-1
	}
}

println
printInfoMessage("Question 4")

for (x <- 1 to 25) {
	print(s"$x\t")
	if (x % 10 == 0)
		println
}

printInfoMessage("Question 5")

for (x <- 1 to 25) {
	if(x % 3 != 0 )
		print(s"$x\t")
	else if (x % 3 == 0 && x % 5 == 0)
		print("three & five\t")
	else if (x % 3 == 0)
		print("three\t")
	else if (x % 5 == 0)
		print("five\t")

	if (x % 10 == 0)
		println
}
println

printInfoMessage("Question 5")
for (x <- 1 to 25) {if(x % 3 != 0 ) print(s"$x\t") else if (x % 3 == 0 && x % 5 == 0) print("three & five\t") else if (x % 3 == 0) print("three\t") else if (x % 5 == 0) print("five\t"); if (x % 10 == 0) println}; println