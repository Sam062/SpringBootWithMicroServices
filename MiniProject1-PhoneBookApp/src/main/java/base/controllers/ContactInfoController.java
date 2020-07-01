package base.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import base.model.ContactModel;
import base.service.IContactService;

@Controller
public class ContactInfoController {
	
	@Autowired
	private IContactService service;

	@GetMapping({"/","/home"})
	public String loadHomePage(Model model) {
		ContactModel contactModel=new ContactModel();
		model.addAttribute("Model", contactModel);
		return "home";
	}

	@PostMapping("/add")
	public String readFormData(@ModelAttribute("contact")ContactModel contact, RedirectAttributes model) {
		System.out.println(contact);
		model.addFlashAttribute("msg", "Contact Read Successfully");
		return "redirect:/home";
	}
}
