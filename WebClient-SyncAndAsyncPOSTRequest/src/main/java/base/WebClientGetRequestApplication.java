package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import base.invokeRest.MyClient;

@SpringBootApplication
public class WebClientGetRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientGetRequestApplication.class, args);
		MyClient.invokeRest("Y1JC-UQKE-F0XW-P");
		
	}

}
