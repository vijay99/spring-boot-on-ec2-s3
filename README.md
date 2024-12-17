# Spring Boot application on EC2 with S3

This project demonstrates a simple Spring Boot application deployed on an AWS EC2 instance with integration to AWS S3. The application serves as a minimal example for hosting a Spring Boot app in the AWS ecosystem.

## Features
- **Single API**: `/test` endpoint to verify application functionality.
- Hosted on an AWS EC2 instance.
- Demonstrates downloading JAR files from S3 and running them in an AWS environment.

## Usage
1. Access the application via the public DNS or IP of the EC2 instance.
2. Send a GET request to the `/test` endpoint to verify it is working.

## Example
```bash
curl http://<ec2-public-dns-or-ip>:8080/test
```

## Prerequisites
- AWS EC2 instance with Java 17 installed.
- Spring Boot JAR file deployed from S3.
- Proper IAM permissions for S3 access (if applicable).

## License
This project is open-source and can be modified as needed.

