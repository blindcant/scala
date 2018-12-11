val message = "ERROR"

val status = message match {
  case "Ok" => 200
  // using wild card
  case _ => {
    println("Couldn't parse " + message)
    println(s"Failed to parse $message")
    // return code of -1
    -1
  }
}
