def abs(x: Double) = if (x < 0) -x else x

// Create a code block to contain the functions not meant to be used outside of this function
def sqrt(x: Double) = {
  // There are 2 types of block scope in scala
  // Definitions inside a block are only visible inside the block
  // Definitions outside a block are only visible inside the block if there isn't a variable with the same name inside it.
  // Thus we can remove all inside x variables as their values don't change, so we can use the parameter x instead.
  def sqrtIt(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIt(improve(guess))

  def isGoodEnough(guess: Double) =
  // Find the square of guess and minus it by x
  // The division by x is needed because the hard coded epsilon of 0.001 can either be too small or too large.
    abs(guess * guess - x) / x < 0.001

  // If the result was too small, increase it
  def improve(guess: Double) =
    (guess + x / guess) / 2

  // Use 1 as a starting point
  sqrtIt(1.0)
}
sqrt(2)
sqrt(4)
sqrt(16)
sqrt(1e-6)
sqrt(1e60)