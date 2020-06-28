package base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/show")
	public String showHome(Model model) {
		model.addAttribute("msg", "WELCOME HOME");
		
		String s=null;
		s.length();
		
		return "home";
	}

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model) {
		model.addAttribute("errMsg", "--- SOME ERROR OCCURRED ---");
		return "error";	
	}

}
