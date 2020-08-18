package base.invokeRest;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import base.model.UserModel;

public class MyClient{
	public static void invokeRest(String SSN) {
		String url="http://localhost:9935/saveSsn";

		UserModel m=new UserModel();
		m.setFname("SAM");
		m.setLname("MISSS");
		m.setGender("M");
		m.setState("UP");
		m.setDob(new Date("01/10/1997"));

		WebClient wc = WebClient.create();	
		String resp = wc.post()
				.uri(url)
				.body(BodyInserters.fromValue(m))
				.accept(MediaType.APPLICATION_JSON)
				.header("Content-Type", "application/json")
				.retrieve()
				.bodyToMono(String.class)
				.block();
		System.out.println("RESPONCE ::" +resp);
	}
}
