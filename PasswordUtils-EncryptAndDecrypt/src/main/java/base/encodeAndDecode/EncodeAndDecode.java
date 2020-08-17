package base.encodeAndDecode;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeAndDecode {
	public static String encodePwd(String encryptedPassword) {
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(encryptedPassword.getBytes());
		return new String(encode);
	}

	public static String decodePwd(String encodedPassword) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedPassword.getBytes());
		return new String(decode);
	}
}
