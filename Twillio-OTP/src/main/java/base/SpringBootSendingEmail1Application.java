package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.twilio.rest.api.v2010.account.Message.Status;

import base.config.TwilloMsg;

@SpringBootApplication
public class SpringBootSendingEmail1Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootSendingEmail1Application.class, args);
		TwilloMsg bean = run.getBean(TwilloMsg.class);
		Status sendMsg = bean.sendMsg();
		System.out.println("***************************");
		System.out.println(sendMsg);
	}
}
