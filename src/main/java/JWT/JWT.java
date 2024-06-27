package JWT;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

    class Server {
        private Key secretKey;

        public Server() {
            this.secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256); // Generate a random secret key
        }

        public String generateToken(int userId) {
            return Jwts.builder()
                    .setSubject(String.valueOf(userId))
                    .setExpiration(new Date(System.currentTimeMillis() + 360)) // Token expires in 360 ms
                    .signWith(secretKey)
                    .compact();
        }

        public String validateToken(String token) {
            try {
                Claims claims = Jwts.parserBuilder()
                        .setSigningKey(secretKey)
                        .build()
                        .parseClaimsJws(token)
                        .getBody();

                return claims.getSubject(); // Return the user ID (subject) if token is valid
            } catch (io.jsonwebtoken.ExpiredJwtException e) {
                return "Token has expired";
            } catch (io.jsonwebtoken.JwtException e) {
                return "Invalid token";
            }
        }
    }

    class Client {
        private Server server;
        private String token;

        public Client(Server server) {
            this.server = server;
        }

        public void authenticate(int userId) {
            this.token = server.generateToken(userId);
            System.out.println("Client received token: " + this.token);
        }

        public void makeRequest() {
            if (this.token != null) {
                String validationResponse = server.validateToken(this.token);
                if (validationResponse.equals("Token has expired") || validationResponse.equals("Invalid token")) {
                    System.out.println("Request denied: " + validationResponse);
                } else {
                    System.out.println("Request approved for user_id: " + validationResponse);
                }
            } else {
                System.out.println("Client is not authenticated");
            }
        }
    }

    public class JWT {
        public static void main(String[] args) throws InterruptedException {
            Server server = new Server();
            Client client = new Client(server);

            // Client authenticates
            client.authenticate(123);

            // Client makes a request
            client.makeRequest();

            // Simulate token expiration (for demonstration purposes, we will just wait for 2 seconds)
            Thread.sleep(86); // Wait for 2 seconds; change this to > 1 hour to see token expiry in a real case

            // Client makes another request (this will fail if the token has expired)
            client.makeRequest();

        }
    }


