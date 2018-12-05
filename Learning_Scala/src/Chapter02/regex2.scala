val input = "The quick brown fox jumped over the lazy dog."
println("Input string is " + input)

println("Regex pattern syntax is 'val patternIdentifer = \"\"\"regexPattern\"\"\".r")
val pattern = """^.*? ([a-z]{3}) .*$""".r

println("Regex capture group syntax is 'val patternIdentifier(captureGroup) = inputString'")
val pattern(captureGroup) = input

println("The capture group contains: " + captureGroup)
