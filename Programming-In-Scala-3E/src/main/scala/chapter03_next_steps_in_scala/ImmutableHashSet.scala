package chapter03_next_steps_in_scala
import scala.collection.immutable.HashSet

object ImmutableHashSet extends App {
	val hashSet = HashSet("Tomatoes", "Chillies")
	println(hashSet + "Coriander")
	print(hashSet)
}
