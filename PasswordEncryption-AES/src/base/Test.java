package base;

import base.util.PasswordUtils;

public class Test {
	public static void main(String[] args) throws Exception {
		String password="Sam*windows";
		System.out.println("Original Pass :: "+password);
		String encrypted = PasswordUtils.encrypt(password);
		System.out.println("Encrypted And Decoded Password :: "+encrypted);
		
		
		String decrypt = PasswordUtils.decrypt(encrypted);
		System.out.println("Decoded And Decrypted :: "+decrypt);
	}

}
