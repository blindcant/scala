package chapter03_next_steps_in_scala

import scala.io.Source

// /home/dhall/dev/random_io_files/I_can_eat_glass.txt
object ReadFileCountCharacters extends App {
	// Get the length of the string, convert that number to a string, and get how many numbers it is.
	def widthOfLength(s: String) = s.length.toString.length

	if (args.length > 0) {
		// Source.fromFile try and open a file
		// sourceObject.getLines returns an Iterator[String] which has each line per iteration, excluding end of line. It can only be iterated through once though.		// for iterates through each line
		// Store as an immutable list so it can be iterated more than once.
		val lines = Source.fromFile(args(0)).getLines().toList

		// Apply the passed in function to the first 2 elements of the List and get a result.
		// Repeat above for the rest of the list.
		val longestLine = lines.reduceLeft(
			(a, b) => if (a.length > b.length) a else b
		)

		val maxWidth = widthOfLength(longestLine)
		for (line <- lines) {
			// Work out how many spaces are needed
			val numberOfSpaces = maxWidth - widthOfLength(line)
			// Use string replication to pad with spaces
			val padding = " " * numberOfSpaces
			println(padding + line.length + " | " + line)
		}
	}
	else
		Console.err.println("Please enter filename")
}
