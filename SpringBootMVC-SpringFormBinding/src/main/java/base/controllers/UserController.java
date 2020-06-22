package base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import base.model.User;

@Controller
public class UserController {

	@GetMapping({"/","/home"})
	public String loadForm(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "home";
	}
	
	@PostMapping("/reg")
	public String readForm(@ModelAttribute("user")User user,Model model) {
		System.out.println(user);
		model.addAttribute("user", user.toString());
		return "data";
	}
	

}
