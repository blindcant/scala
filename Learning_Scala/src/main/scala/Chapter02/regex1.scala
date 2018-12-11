val x = "ABC 123 !@#"
println("matches returns true if the regex matches the entire string")
println("replaceAll replaces all matched text with the supplied value.")
println("replaceFirst replaces all matched text with the supplied value.")
println(x)
println("x matches \".*!@#\"")
println(x matches ".*!@#")
println("x replaceAll(\"[^A-Z]\", \"*\"")
println(x replaceAll("[^A-Z]", "*"))
println("x replaceFirst(\"[^A-Z]\", \"*\"")
println(x replaceFirst("[^A-Z]", "*"))

