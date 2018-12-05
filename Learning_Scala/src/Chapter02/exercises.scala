def printInfoMessage(s: String): Unit =  println("\n[INFO] " + s + "\n") 

printInfoMessage("Question 1")

val f = 72.5
val c = 22.5

val c2f = (c * 9.0 / 5.0) + 32.0
val f2c = (5.0 /9.0) * (f - 32.0)

println(c + " c is now " + c2f + " f")
println(f + " f is now " + f2c + " c")

printInfoMessage("Question 2")

println(c + " c is now " + c2f.toInt + " f")
println(f + " f is now " + f2c.toInt + " c")

printInfoMessage("Question 3")

val aDouble = 2.7255
println("Double $$ is how to print a literal $")
println(s"You owe $$${aDouble}")
println(f"You owe $$$aDouble%.2f")

printInfoMessage("Question 4")

val flag: Boolean = false
val result: Boolean = (flag == false)
val result2 = (flag == false)


printInfoMessage("Question 5")

val anInt: Int = 128
val aChar = anInt.toChar
val aString = anInt.toString
val aDouble = anInt.toDouble
val anInt2 = aDouble.toInt

printInfoMessage("Question 6")

val inputString = "Frank,123 Main,925-555-1943,95122"
println(inputString.replaceAll("^.*,([0-9-]+),.*$", "$1"))
val regexPhoneFull = """^.*,([0-9-]+),.*$""".r
val regexPhoneFull(regexResult) = inputString
val regexPhoneFullResult = regexResult.toString

println(regexPhoneFullResult.replaceAll("^([0-9]+)-[0-9]+-[0-9]+", "$1"))
val regexPhoneDigits = """([0-9]+)-[0-9]+-[0-9]+""".r
val regexPhoneDigits(regexResult) = regexPhoneFullResult
val regexPhoneDigits1 = regexResult.toString

println(regexPhoneFullResult.replaceAll("^[0-9]+-([0-9]+)-[0-9]+", "$1"))
val regexPhoneDigits = """[0-9]+-([0-9]+)-[0-9]+""".r
val regexPhoneDigits(regexResult) = regexPhoneFullResult
val regexPhoneDigits2 = regexResult.toString

println(regexPhoneFullResult.replaceAll("^[0-9]+-[0-9]+-([0-9]+)", "$1"))
val regexPhoneDigits = """[0-9]+-[0-9]+-([0-9]+)""".r
val regexPhoneDigits(regexResult) = regexPhoneFullResult
val regexPhoneDigits3 = regexResult.toString
