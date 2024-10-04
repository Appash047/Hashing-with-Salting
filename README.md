Password Hashing with Salting in Java

This project demonstrates how to securely hash passwords with a salt in Java, ensuring protection against attacks like rainbow table lookups. It includes two key functionalities:

	•	Hashing a password with a random salt during registration.
	•	Verifying the password during login by comparing the stored hash with the newly hashed password using the same salt.

Getting Started

Prerequisites

	•	Java 8+ installed on your system.
	•	Basic knowledge of Java security and cryptography libraries.

Libraries Used

	•	java.security for generating secure random salt.
	•	javax.crypto for password hashing using PBKDF2WithHmacSHA512.

How It Works

1. Password Hashing (Registration)

When a user registers, a random salt is generated and combined with their password before hashing it. The salt and hashed password are then stored in the database.

2. Password Validation (Login)

During login, the stored salt is retrieved and used to hash the entered password. The hashed result is compared with the stored hash. If they match, the user is authenticated.

Code Overview

PasswordUtil.java

	•	generateSalt(): Generates a random 16-byte salt using SecureRandom.
	•	hashPassword(): Hashes the password using PBKDF2WithHmacSHA512, combining it with the salt.
	•	registerUser(): Combines salt generation and password hashing for registration.

PasswordValidator.java

	•	validatePassword(): Takes the user’s entered password, retrieves the stored salt, and checks if the hash matches the stored hash.

Example Usage
// Register a user
String[] registrationData = PasswordUtil.registerUser("password123");
String salt = registrationData[0];
String hashedPassword = registrationData[1];

// Validate the password during login
boolean isAuthenticated = PasswordValidator.validatePassword("password123", hashedPassword, salt);
System.out.println("Authenticated: " + isAuthenticated);

Run the Code

	1.	Clone this repository:  git clone https://github.com/Appash047/Hashing-with-Salting

 2.	Compile and run the Main.java class in your IDE or from the command line.

Learn More

If you’re new to password hashing and salting, check out these helpful links:

	•	Hashing vs Encryption
	•	Salting in Cryptography
