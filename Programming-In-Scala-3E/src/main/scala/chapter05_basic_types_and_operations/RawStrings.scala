package chapter05_basic_types_and_operations

class RawStrings {
	def printRawStringSpaceIssue(): Unit = {
		println("""Welcome to the jungle.
		We got fun and games.""" + "\n")
	}

	// The stripMargin methods removes the leading spaces using the pipes
	def printRawStringNoSpaceIssue(): Unit = {
		println("""    |Welcome to the jungle.
		|We got fun and games.""".stripMargin + "\n")
	}
}

object RawStrings extends App {
	var rawStrings = new RawStrings
	rawStrings.printRawStringSpaceIssue()
	rawStrings.printRawStringNoSpaceIssue()
}
