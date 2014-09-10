package hello

import org.springframework.boot.SpringApplication
  
object MyWebApplication {

	def main(args: Array[String]) {
	  println("In Main tests")
	   SpringApplication.run(classOf[MyConfig]);
	}
}