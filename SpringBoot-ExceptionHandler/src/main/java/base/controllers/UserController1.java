package base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController1 {
	
	@RequestMapping("/home")
	public String showHome() {
		
		String s=null;
		s.length();
		
		return "home";
	} 

}
