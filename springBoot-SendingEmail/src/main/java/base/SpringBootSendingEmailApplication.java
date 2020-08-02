package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import base.util.EmailUtils;

@SpringBootApplication
public class SpringBootSendingEmailApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootSendingEmailApplication.class, args);
		EmailUtils bean = run.getBean(EmailUtils.class);
		
//		Boolean emailSent = bean.isEmailSent("ip6.sam@gmail.com", "TESTING MAIL", "SENT FROM SPRING BOOT APP");
		
		Boolean emailSent = bean.isMimeEmailSent("ip6.sam@gmail.com", "<h1>TESTING MAIL</h1>", "<b>SENT FROM SPRING BOOT APP</b>");
		
		
		
		System.out.println("**** MAIL SENT**** "+emailSent);
		
		
	}

}
