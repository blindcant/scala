import scala.math.{Pi}

val data = Pi
val compare: Any = data

compare match {
  case data: String => s"'data'"
  case data: Float => f"$data%.2f"
  case data: Double => f"$data%.2f"
  case data: Int => s"${data}i" 
  case data: Long => s"${data}l"  
}
