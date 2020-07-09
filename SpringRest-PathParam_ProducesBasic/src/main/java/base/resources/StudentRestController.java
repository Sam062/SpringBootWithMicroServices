package base.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import base.model.Student;

@RestController
public class StudentRestController {

	@GetMapping(value = "/data/{id}",produces = "application/json")
	public Student giveDetails(@PathVariable("id")Integer id) {
		if(id==101)
			return new Student(101, "SAM", 123.4);
		else if(id==201)
			return new Student(201, "XYZ", 234.5);
		else
			return new Student(null, null, null);
	}
}
