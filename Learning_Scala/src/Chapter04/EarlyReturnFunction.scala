def safeTrim(s: String): String = {
	if(s == null) {
		// Explicit early return
		return null
	}
	// Last line is implicit return
	s.trim
}

val s: String = " abc "

println(safeTrim(s))
println(safeTrim(null))