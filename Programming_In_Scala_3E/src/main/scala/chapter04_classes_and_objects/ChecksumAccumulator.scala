package chapter04_classes_and_objects

// Public is the default in Scala, so don't need to write public for class definitions
class ChecksumAccumulator {
	private var sum = 0

	def add(b: Byte): Unit = {
		sum += b
	}

	def checksum(): Int = {
		// The return is redundant as Scala returns the last value
		return ~(sum & 0xFF) + 1
	}

	def setSum(value: Byte): Unit = {
		this.sum = value
	}

	def getSum(): Int = {
		this.sum
	}
}

import scala.collection.mutable

object ChecksumAccumulator {
	// Store the previous checksums here
	private val cache = mutable.Map.empty[String, Int]

	// Take a string and calculate its checksum if its new
	def calculate(s: String): Int =
		if (cache.contains(s))
			cache(s)
		else {
			val checksumAccumulator = new ChecksumAccumulator
			// Go through each character
			for (aChar <- s)
				// Add each characters byte
				checksumAccumulator.add(aChar.toByte)
			val checksum = checksumAccumulator.checksum()
			// Add the new checksum to the map
			cache += (s -> checksum)
			// Implicitly return checksum
			checksum
		}
}



