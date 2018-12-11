val message = "ERROR"

val status = message match {
  case "Ok" => 200
  // using wild card
  case other => {
    println("Couldn't parse $other")
    // return code of -1
    -1
  }
}
