package base.util;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PasswordUtils {
	
	/*
	 * IN Spring we have all the Algorithms just we need to add Spring security Dependency.
	 * MessageDigestPasswordEncoder
	 * Pbkdf2PasswordEncoder
	 * BCryptPasswordEncoder
	 * SCryptPasswordEncoder...
	 */
	
	private static final String SECRET_KEY="16DIGIT_ALPHANUM";
	private static final String INIT_VECTOR="16DIGIT_ALPHANUM";

	public static String encrypt(String password) throws Exception {
		IvParameterSpec ivParameterSpec = new IvParameterSpec(INIT_VECTOR.getBytes());
		SecretKeySpec secretKeySpec = new SecretKeySpec(SECRET_KEY.getBytes("UTF-8"), "AES");

		Cipher cipher= Cipher.getInstance("AES/CBC/PKCS5PADDING");

		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec,ivParameterSpec);
		byte[] encrypted = cipher.doFinal(password.getBytes());

		return Base64.getEncoder().encodeToString(encrypted);	
	}
	public static String decrypt(String password) throws Exception {
		byte[] decode = Base64.getDecoder().decode(password.getBytes());
		
		IvParameterSpec ivParameterSpec = new IvParameterSpec(INIT_VECTOR.getBytes());
		SecretKeySpec secretKeySpec = new SecretKeySpec(SECRET_KEY.getBytes("UTF-8"), "AES");
		
		Cipher cipher= Cipher.getInstance("AES/CBC/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE,secretKeySpec,ivParameterSpec);
		byte[] decrypted = cipher.doFinal(decode);
		
		return new String(decrypted);
	}
}
