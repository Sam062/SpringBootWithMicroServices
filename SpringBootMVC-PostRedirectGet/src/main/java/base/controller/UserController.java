package base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import base.model.User;

@Controller
public class UserController {
	@GetMapping({"/","/home"})
	public String showHome(Model model) {
		model.addAttribute("user", new User());
		return "home";
	}
	@PostMapping("/reg")
	public String regisetr(@ModelAttribute("user")User user,RedirectAttributes attribute) {
		attribute.addFlashAttribute("msg", "REGISTERED..."); // Redirecting TO GET type method
		return "redirect:/home";
	}
}
