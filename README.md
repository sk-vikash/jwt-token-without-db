# JWT Token

## Overview

This repo contains java application to generate JWT token, provide secured to a API resource using the token. Also, provides an endpoint to refresh the token. JWT (Java web token) is explained under [RFC 7519](https://tools.ietf.org/html/rfc7519).

## Requirements

  * Maven (3.5+)
  * Oracle Java JDK 1.8
  
## Installation

Checkout or fork the repository. Execute the Maven install goal to build the target .jar file.

## Technologies Used

  * Oracle Java 1.8
  * Spring dependency with spring boot
  * Maven
  * Jetbrains IntelliJ IDEA CE


## Operation

The service operation is normally automated but can be manually operated

  * Navigate to the filesystem path containing the assembled jar file
  * Use `mvn clean package` to generate the jar artifacts.
  * Use `java -jar jwt-restful-web-services-dbless-1.0-SNAPSHOT.jar` at the command line to start the service.
  
## Endpoint

  * Obtain token - `http://localhost:8080/get-token` 
  * Refresh token  - `http://localhost:8080/refresh-token`
  * Resource access - `http://localhost:8080/get-city`
  
# Example cURL

Obtain token
    
    curl -X POST http://localhost:8080/get-token -H 'Content-Type: application/json' -d '{"username": "jamshedpur", "password": "Password$@!54321"}'
  
Refresh token
  
    curl -X GET http://localhost:8080/refresh-token -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYW1zaGVkcHVyIiwiZXhwIjoxNTg1NjA4NTcwLCJpYXQiOjE1ODU2MDgyNzB9.LLuGk_vBeqpVmdKiuItrver494UAxIJcw-DDv0OQOWDSZMfrRBYlzsOs6xCdWmARw717GOyE_cPAfVIF6FbCXQ' -H 'Content-Type: application/json'
    
Resource access

    curl -X GET http://localhost:8080/get-city -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYW1zaGVkcHVyIiwiZXhwIjoxNTg1NjA4NTcwLCJpYXQiOjE1ODU2MDgyNzB9.LLuGk_vBeqpVmdKiuItrver494UAxIJcw-DDv0OQOWDSZMfrRBYlzsOs6xCdWmARw717GOyE_cPAfVIF6FbCXQ' -H 'Content-Type: application/json'
