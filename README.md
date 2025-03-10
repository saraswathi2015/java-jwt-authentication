# Java JWT Authentication

## About
This is a Java project that demonstrates how to implement JSON Web Token (JWT) authentication in a Spring Boot application. JWT is a compact, URL-safe means of representing claims to be transferred between two parties. This project showcases how to secure APIs by generating and verifying JWT tokens.

## Features
- User authentication with JWT.
- Token generation on successful login.
- Token validation for secure access to protected endpoints.
- Easy integration with any Spring Boot application.

## Technologies Used
- **Java** (JDK 8 or higher)
- **Spring Boot** (for API development)
- **Spring Security** (for securing endpoints)
- **JWT** (for token-based authentication)
- **Maven** (for dependency management)

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/saraswathi2015/java-jwt-authentication.git
   cd java-jwt-authentication

2.Install dependencies:
mvn install

3.Run the application:
mvn spring-boot:run

4.Access the API endpoints. By default, the application runs on http://localhost:8080

Endpoints
POST /login: Authenticates user and returns JWT token.
GET /secure: A secure endpoint that requires JWT token for access.

How JWT Works in This Project:
The user sends their credentials to the /login endpoint.
If the credentials are valid, a JWT token is generated and sent back.
The client includes the JWT token in the Authorization header as a Bearer token for protected API calls.
The server validates the JWT token before allowing access to the secured endpoint.

