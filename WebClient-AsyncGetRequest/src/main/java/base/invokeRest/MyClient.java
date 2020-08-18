package base.invokeRest;

import org.springframework.web.reactive.function.client.WebClient;

public class MyClient{
	public static void invokeRest(String SSN) {
		System.out.println("*** REST CALL START ***");
		String url="http://localhost:9935/validateSSN/{SSN}";
		WebClient wc = WebClient.create();	
		wc.get()
		.uri(url, SSN)
		.retrieve()
		.bodyToMono(String.class)
		.subscribe(MyClient::response);
		System.out.println("*** REST CALL END ***");
	}
	public static void response(String resp) {
		System.out.println(resp);
	}
}
