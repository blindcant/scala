val returnCode = 400

val message = returnCode match {
  case 200 => "Ok"
  case 400 =>  {
    println("ERROR - incorrect service call")
  }
  case 500 => {
    println("ERROR - service had an error")
  }
}

