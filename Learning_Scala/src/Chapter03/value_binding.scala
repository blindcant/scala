// Using yield to create a collection containing the results of the bit shift.
// The argument for shift left is how many bits to shift to the left. This effectively is multiplying by 2.
val powersOf2 = for (i <- 0 to 8; power = 1 << i) yield power