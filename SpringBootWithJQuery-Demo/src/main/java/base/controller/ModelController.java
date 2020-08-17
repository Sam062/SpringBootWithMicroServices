package base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import base.model.ModelClass;

@Controller
public class ModelController {

	@GetMapping({"/","/home"})
	public String showHome(Model model) {
		ModelClass mc=new ModelClass();
		model.addAttribute("model", mc);
		return "index";
	}

	@PostMapping("/reg")
	public String register(@ModelAttribute("model")ModelClass model1,Model model) {
		System.out.println(model1);
		model.addAttribute("msg", "DONE");
		return "data";
	}

}
