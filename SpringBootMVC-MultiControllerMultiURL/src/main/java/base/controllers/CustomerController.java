package base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/cust","/cust1"})
public class CustomerController {
	
	@GetMapping({"/show","/show1"})
	public String showCust(Model model) {
		
		model.addAttribute("msg", "WELCOME TO CUSTOMER HOME PAGE");
		
		return "index";
	}
}
