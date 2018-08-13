package chapter02_getting_started

object CommandLineArguments extends App {
	var i = 0
	while (i < args.length) {
		println("args(" + i + ") is " + args(i))
		i += 1
	}
}
