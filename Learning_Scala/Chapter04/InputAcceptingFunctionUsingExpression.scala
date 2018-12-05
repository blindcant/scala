def formatEuro(amount: Double) = f"€$amount%.2f"

println(formatEuro { val rate = 1.32; 0.235 + 0.7123 + rate * 5.32 })

