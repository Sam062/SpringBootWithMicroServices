package base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LottryController {

	@GetMapping({"/","/home"})
	public String showHome() {
		return "home";
	}

	@PostMapping("/check")
	public String check(HttpServletRequest req,RedirectAttributes redirect) {
		int val=Integer.parseInt(req.getParameter("value"));

		double valu=Math.random()*10.0;
		int value=(int)valu;
		String msg="";
		if(val>9)
			msg="VALUE ONLY 0-9";
		else {
			if(val==value)
				msg="CONGRATS !! YOU WON 1 CRORE INDIAN RUPEES..";
			else
				msg="SORRY!! TRY ANOTHER TIME..";
		}

		redirect.addFlashAttribute("msg", msg);
		return "redirect:/home";
	}
}
