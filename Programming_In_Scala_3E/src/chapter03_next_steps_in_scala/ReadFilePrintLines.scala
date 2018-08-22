package chapter03_next_steps_in_scala
import scala.io.Source

// /home/dhall/dev/random_io_files/I_can_eat_glass.txt
object ReadFilePrintLines extends App {
	if (args.length > 0) {
		// Source.fromFile try and open a file
		// sourceObject.getLines returns an Iterator[String] which has each line, excluding end of line.
		// for iterates through each line
		for (line <- Source.fromFile(args(0)).getLines())
			println(line.length + " " + line)
	}
	else
		Console.err.println("Please enter a filename.")
}
