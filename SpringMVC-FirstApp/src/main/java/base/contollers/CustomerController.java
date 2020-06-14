package base.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cust")
public class CustomerController {

	@RequestMapping("/custHome")
	public ModelAndView showMsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "WELCOME TO CUSTOMER HOME PAGE !!");
		mav.setViewName("home");
		
		return mav;
	}

	
}
