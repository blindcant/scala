package chapter02_getting_started

object CommandLineArgumentsFunctional extends App {
	args.foreach(arg => println("arg is currently " + arg))
}
