package base.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpTest {
	@Autowired
	private static RestTemplate temp;
	
	public static void validateSSN(String ssn) {
		String url="http://localhost:9935/validateSSN/{ssn}";
		temp=new RestTemplate();
		ResponseEntity<String> resp = temp.getForEntity(url, String.class,ssn);
		String body = resp.getBody();
		System.out.println("**** RESPONSE :: "+body+ " Status Code :: " +resp.getStatusCodeValue());
	}
	public static String saveSSN(User user) {
		String url="http://localhost:9935/saveSsn";
		RestTemplate temp=new RestTemplate();
		
		// To add Headers
		//	HttpHeaders headers = new HttpHeaders();
		//	headers.add("Accept", "application/json");
		//	headers.add("Content-Type", "application/json");
		//	HttpEntity<User> httpEntity = new HttpEntity<>(user,headers);
		//	In this case we Go for - temp.postForEntity(url, httpEntity, String.class)
		
		
		ResponseEntity<String> resp = temp.postForEntity(url, user, String.class);
		String body = resp.getBody();
		
		
		
		System.out.println("**** RESPONSE :: "+body+ " Status Code :: " +resp.getStatusCodeValue());
		
		return body;
	}
	
	

}
