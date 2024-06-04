package JWT;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JWTExample {
    // Shared secret key
    public static final Key SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public static String jwtMethod() {
        // Generate JWT using the shared secret key
        String jwt = Jwts.builder()
                .setSubject("user123") // subject
                .setIssuedAt(new Date()) // issued time
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // expires in 24 hours
                .signWith(SECRET_KEY) // signing algorithm and secret key
                .compact();

        // Send JWT to server (in a real scenario, this would be part of an HTTP request)
        return jwt;
    }
}



