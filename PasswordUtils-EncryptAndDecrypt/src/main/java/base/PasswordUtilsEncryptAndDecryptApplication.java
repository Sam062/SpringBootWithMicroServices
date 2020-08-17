package base;

import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import base.encodeAndDecode.EncodeAndDecode;
import base.passwordUtils.PasswordUtils;

@SpringBootApplication
public class PasswordUtilsEncryptAndDecryptApplication {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		SpringApplication.run(PasswordUtilsEncryptAndDecryptApplication.class, args);
		System.out.println("**************** ENCRYPTION *******************");
		String password="Sam*pass";
		System.out.println("Original Password ::"+password);
		String encryptPwd = PasswordUtils.encryptPwd(password);
		System.out.println("ENCRYPTED PASSWORD :: "+encryptPwd);
		
		String encodePwd = EncodeAndDecode.encodePwd(encryptPwd);
		System.out.println("ENCODED AND ENCRYPTED PASSWORD :: "+encodePwd);
		
		String decodePwd = EncodeAndDecode.decodePwd(encodePwd);
		System.out.println("DECODED PASSWORD :: "+decodePwd);
		System.out.println("***************************************************");
		
		
		String pass2="Sam*pass";
		String encryptPwd2 = PasswordUtils.encryptPwd(pass2);
		System.out.println(encryptPwd2);
		String encodePwd2 = EncodeAndDecode.encodePwd(encryptPwd2);
		System.out.println(encodePwd2);
		System.out.println(encodePwd.equals(encodePwd2));
		
	}

}
