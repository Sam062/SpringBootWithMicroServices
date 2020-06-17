package base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/user","/user1"})
public class UserController {
	
	@GetMapping({"/home","/home1"})
	public ModelAndView showHome() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		mav.addObject("msg", "*** WELCOME TO USER HOME PAGE ****");
		return mav;
	}

}
