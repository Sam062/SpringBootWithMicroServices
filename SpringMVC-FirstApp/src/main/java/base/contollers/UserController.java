package base.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/userHome")
	public ModelAndView showMsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "WELCOME USER HOME PAGE !!");
		mav.setViewName("home");
		
		return mav;
	}

}
