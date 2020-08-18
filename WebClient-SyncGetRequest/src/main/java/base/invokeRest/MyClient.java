package base.invokeRest;

import org.springframework.web.reactive.function.client.WebClient;

public class MyClient{
	public static void invokeRest(String SSN) {
		String url="http://localhost:9935/validateSSN/{SSN}";
		WebClient wc = WebClient.create();	
		String resp = wc.get()
				.uri(url, SSN)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		System.out.println("RESPONCE ::" +resp);
	}
}
