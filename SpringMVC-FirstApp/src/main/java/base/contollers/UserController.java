package base.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/home")
	public ModelAndView showMsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "WELCOME HOME PAGE !!");
		mav.setViewName("home");
		
		return mav;
	}

}
