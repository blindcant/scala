// The factorial function (symbol: !) says to multiply all whole numbers from our chosen number down to 1.
// E.g. 4! = 4 x 3 x 2 x 1 = 24

def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)
factorial(4)
/*
factorial(4)
if (4 == 0) -> false
4 * factorial(4 - 1) -> 4 * factorial(3)
if (3 == 0) -> false
3 * factorial(3 - 1) -> 4 * 3 * factorial(2)
if (2 == 0) -> false
2 * factorial(2 - 1) -> 4 * 3 * 2 * factorial(1)
if (1 == 0) -> false
1 * factorial(1 - 1) -> 4 * 3 * 2 * 1 factorial(0)
if (0 == 0) -> true -> 1
4 * (3 * (2 * (1 * 1)))
24
 */