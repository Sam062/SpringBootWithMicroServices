package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import base.test.HttpTest;
import base.test.User;

@SpringBootApplication
public class SsnPortalClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsnPortalClientApplication.class, args);
		
		//HttpTest.validateSSN("1XS5-TUMG-HLO8-2D0B");
		
		HttpTest.saveSSN(new User("ABC", "XYZ", "M", "1997-10-01", "UP"));
		
		
	}

}
