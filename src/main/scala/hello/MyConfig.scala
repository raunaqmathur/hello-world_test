package hello
import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.{RequestMapping,RequestMethod}
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController



@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class MyConfig {
  var counter =0
  @RequestMapping(Array("/"))
   def MyConfig() : String = {
    counter= counter +1
    	  println("Request No:" + counter)
   return  "Hello World!"
  
  }
}