// The factorial function (symbol: !) says to multiply all whole numbers from our chosen number down to 1.
// E.g. 4! = 4 x 3 x 2 x 1 = 24

def factorial(n: Int): Int = {
  def loop(accumulator: Int, n: Int): Int = {
    if (n == 0) accumulator
    else loop(accumulator * n, n - 1)
  }
  loop(1, n)
}
factorial(4)
/*
factorial(4) -> loop(1, 4)
if (4 == 0) -> false
else loop(accumulator * n, n - 1)
loop(1 * 4, 3)
if (3 == 0) -> false
else loop(accumulator * n, n - 1)
loop(4 * 3, 2)
if (2 == 0) -> false
else loop(accumulator * n, n - 1)
loop(12 * 2, 1)
if (1 == 0) -> false
else loop(accumulator * n, n - 1)
loop(24 * 1, 0)
if (0 == 0) -> true -> return 24
24
 */