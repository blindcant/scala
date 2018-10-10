def abs(x: Double) = if (x < 0) -x else x

def sqrtIt(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIt(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double) =
  // Find the square of guess and minus it by x
  // The division by x is needed because the hard coded epsilon of 0.001 can either be too small or too large.
  abs(guess * guess - x) / x < 0.001

// If the result was too small, increase it
def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2

// Use 1 as a starting point
def sqrt(x: Double) = sqrtIt(1.0, x)

sqrt(2)
sqrt(4)
sqrt(16)
sqrt(1e-6)
sqrt(1e60)