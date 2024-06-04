package JWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

import java.security.Key;

public class ServerSide {
    // Secret key used to validate JWT
    private static final Key SECRET_KEY = JWTExample.SECRET_KEY;

    public static void main(String[] args) {
        // Received JWT from client (in a real scenario, this would come from an HTTP request)
        String jwtFromClient = JWTExample.jwtMethod();

        // Validate JWT
        try {
            Jws<Claims> claims = Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(jwtFromClient);

            // If no exception is thrown, JWT is valid
            System.out.println("JWT validation successful. Subject: " + claims.getBody().getSubject());
        } catch (Exception e) {
            // If any exception is thrown, JWT is invalid
            System.out.println("JWT validation failed: " + e.getMessage());
        }
    }
}
