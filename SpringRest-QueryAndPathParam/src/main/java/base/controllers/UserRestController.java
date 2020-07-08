package base.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	//QUERY PARAM EXAMPLE
	//localhost:9935/timing?name=ruCHI
	@GetMapping("/name")
	public String showMsg(@RequestParam("name")String name) {
		return "HELLO "+name.toUpperCase();
	}

	//localhost:9935/timing?name=ruCHI&age=55
	@GetMapping("/timing")
	public String showTiming(@RequestParam("name")String name,@RequestParam("age")String age) {
		return "HELLO "+name.toUpperCase()+(", your age is : "+age).toUpperCase();
	}


	//PATH PARAM EXAMPLE
	//localhost:9935/name/SAM
	@GetMapping("/name/{name}")
	public String showName(@PathVariable("name")String name) {
		return "HELLO, "+name;
	}
	//PATH PARAM EXAMPLE
	//localhost:9935/name/sam/spring
	@GetMapping("/name/{name}/{subject}")
	public String showCourseWithName(@PathVariable("name")String name,@PathVariable("subject")String subject) {
		if("sam".equals(name)&&"spr".equals(subject))
			return "ASHOK";
		else
			return "RAGHU";
	}



}
