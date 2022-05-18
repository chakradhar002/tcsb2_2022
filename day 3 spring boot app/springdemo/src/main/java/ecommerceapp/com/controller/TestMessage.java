package ecommerceapp.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
// <artifactId>spring-boot-starter-web</artifactId>
import org.springframework.web.bind.annotation.RestController;

/*@RestController is a convenience annotation for 
creating Restful controllers. It is a specialization 
of @Component and is autodetected through classpath 
scanning. It adds the @Controller and @ResponseBody
annotations. It converts the response to JSON or XML.*/

@RestController
public class TestMessage {
	// api calling

	// GET method
	@GetMapping(value = "/showmessge") // "/showmessge" is called the endpoint or uri
	String Message() {
		return "hi how are you";

	}

}
