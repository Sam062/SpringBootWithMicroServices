package base;

import io.jsonwebtoken.Claims;

public class DemoMain {
	public static void main(String[] args) {
		String token = new JWTUtil().generateToken("SAM062", "SAM", "Sam*secret");
		System.out.println(token);

		Claims claims = new JWTUtil().getClaims("Sam*secret", token);
		System.out.println(claims.getId());
		System.out.println(claims.getSubject());
		System.out.println(claims.getIssuer());
		System.out.println(claims.getIssuedAt());

	}

}
