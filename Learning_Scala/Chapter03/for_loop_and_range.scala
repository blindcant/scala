// Without yeild, cannot access return value outside of loop
for (x <- 1 to 7) {
  println(s"Day $x")
}

// With yield, can access return values outside of the loop in a collection
for (x <- 1 to 7) yield {
  s"Day $x"
}
