// Implicit Unit
def implicitLog(d: Double) = println(f"Got the value $d%.2f")

// Explicit Unit
def explicitLog(d: Double): Unit = println(f"Got the value $d%.2f")

implicitLog(Math.PI)
explicitLog(Math.PI)