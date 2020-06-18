package base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping({"/","/home"})
	public String showHome() {
		return "home";
	}
	
	
	@PostMapping("/register")
	public String readFormData(HttpServletRequest req,Model model) {
		System.out.println(req.getParameter("uname"));
		System.out.println(req.getParameter("pwd"));
		System.out.println(req.getParameter("email"));
		
		model.addAttribute("msg", "USER REGISTERED SUCCESSFULLY");
		return "RegisterSuccess";
	}

}
