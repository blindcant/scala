def printInfoMessage(s: String): Unit =  println("\n[INFO] " + s + "\n") 

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