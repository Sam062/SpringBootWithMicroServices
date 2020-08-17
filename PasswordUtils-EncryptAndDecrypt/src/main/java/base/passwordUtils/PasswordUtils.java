package base.passwordUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtils {
	public static String encryptPwd(String password) throws NoSuchAlgorithmException {
		MessageDigest instance = MessageDigest.getInstance("SHA-256");
		instance.reset();

		instance.update(password.getBytes());
		byte[] digest = instance.digest();

		return new String(digest);
	}
}
