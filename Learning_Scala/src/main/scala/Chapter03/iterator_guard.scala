// Inside the loop
val threes = for (i <- 1 to 20 if i % 3 == 0) yield i

// By itself
val quote = "Harry,Sally,,Johnny"
for {
	token <- quote.split(",")
	if token != null
	if token.size > 0
} {
	println(token)
}