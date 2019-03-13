def greeting(prefix: String, name: String) = {
	s"$prefix $name"
}

// Normal call
println(greeting("Mr", "Sandman"))
// Out of order call using names
println(greeting(name = "Brightside", prefix = "Mr"))