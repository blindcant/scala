def greeting(prefix: String = "Not provided.", name: String = "Unknown.") = {
	s"$prefix $name"
}

println(greeting())
println(greeting(name = "Sandman"))
println(greeting(prefix = "Mr"))
println(greeting("Mr", "Sandman"))
