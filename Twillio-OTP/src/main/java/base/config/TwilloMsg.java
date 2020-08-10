package base.config;

import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.Message.Status;
import com.twilio.type.PhoneNumber;

@Configuration
public class TwilloMsg {
	static {
		Twilio.init("AC4f6a98210eb7b32a3a96bcd6343eb47a", "137927fbd431d826a9da7193ad1f5233");
	}
	public Status sendMsg(){
		Message message = Message.creator(
				new PhoneNumber("+919695654346"),
				new PhoneNumber("+12512835748"),
				"Sample Java Msg For Testing Purpose. -SAM")
				.create();
		return message.getStatus();
	}

}
