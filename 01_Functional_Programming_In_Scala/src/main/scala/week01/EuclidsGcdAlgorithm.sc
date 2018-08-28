def gcd(a: Int, b: Int): Int =
  // If b is 0, then we have found our greatest common divisor
  if (b == 0) a
  // Tail recursive call to gcd, because the last step in the function is to call a function recursively
  else gcd(b, a % b)
/*
gcd(14, 21)
if (21 == 0) -> false
gcd(21, 14 % 21) -> gcd(21, 14)
if (14 == 0) -> false
gcd(14, 21 % 14) -> gcd(14, 7)
if (7 == 0) ->
gcd(7, 14 % 7) -> gcd (7, 0)
if (0 == 0) -> true return a which is 7
*/
