package base;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTUtil {
	public String generateToken(String ID,String subject,String secret) {
		return Jwts.builder()
				.setId(ID)
				.setSubject(subject)
				.setIssuer("SAM")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(1000l)))
				.signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encode(secret.getBytes()))
				.compact();
	}
	public Claims getClaims(String secret,String token) {
		return Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(secret.getBytes()))
				.parseClaimsJws(token)
				.getBody();
	}
	

}
