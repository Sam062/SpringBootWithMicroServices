package base.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
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
		Boolean result=service.saveContact(contact);
		if(result)
			model.addFlashAttribute("msg", "Contact Added Successfully : Name= "+contact.getContactName());
		else
			model.addFlashAttribute("msg", "Contact Couldn't Add !");

		return "redirect:/home";
	}

	@GetMapping("/all")
	public String dataPage(Model model) {
		List<ContactModel> list=service.getAllContacts();
		if(list!=null)
			model.addAttribute("list", list);
		else
			model.addAttribute("msg", "No Data Found !");
		return "data";
	}

	@GetMapping("/delete")
	public String deleteData(@ModelAttribute("id")Integer id,Model model) {
		boolean result=service.deleteContact(id);
		if(result)
			model.addAttribute("msg","Contact Deleted.");
		else
			model.addAttribute("msg", "Contact not deleted.");

		List<ContactModel> contacts=service.getAllContacts();
		model.addAttribute("list", contacts);

		return "data";
	}
	
	@GetMapping("/edit")
	public String showEditPage(@ModelAttribute("id")Integer id,Model model) {
		ContactModel contact=service.getContactByID(id);
		model.addAttribute("contactModel", contact);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateContact(@ModelAttribute("contactModel")ContactModel model, RedirectAttributes attribute) {
		boolean result=service.updateContact(model);
		if(result)
			attribute.addFlashAttribute("msg", "Contact Details Updated.");
		else
			attribute.addFlashAttribute("msg", "Contact Not Found !!");
		return "redirect:/home";
	}
	

}
