package base.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtils {
	@Autowired
	private JavaMailSender javaMailSender;

	public Boolean isEmailSent(String to, String subject, String body) {
		try {
			SimpleMailMessage msg=new SimpleMailMessage();
			msg.setTo(to);
			msg.setSubject(subject);
			msg.setText(body);

			javaMailSender.send(msg);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Boolean isMimeEmailSent(String to, String subject, String body) {
		try {
			MimeMessage msg=javaMailSender.createMimeMessage();
			MimeMessageHelper msgHelper = new MimeMessageHelper(msg);
			String[] recip=new String[2];
			recip[0]="ip6.sam@gmail.com";
			recip[1]="sam9695654346@gmail.com";

			msgHelper.setTo(recip);
			msgHelper.setSubject(subject);
			msgHelper.setText(body,true);

			javaMailSender.send(msg);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
