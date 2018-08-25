package chapter04_classes_and_objects
import ChecksumAccumulator.calculate

object RunChecksumAccumulator extends App {
		for (arg <- args)
			println(arg + " : " + calculate(arg))
}
