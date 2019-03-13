package chapter02_getting_started

object CommandLineArgumentsFunctionalForExpression extends App {
	for (arg <- args)
		println("arg is currently " + arg)
}
