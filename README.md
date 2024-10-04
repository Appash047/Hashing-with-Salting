Password Hashing with Salt in Java

This project demonstrates how to securely hash passwords with a salt to protect against rainbow table attacks.

Features

	•	Password Hashing (Registration): A random salt is generated and combined with the password before hashing.
	•	Password Verification (Login): During login, the stored salt is used to hash the entered password and compared to the stored hash.

How It Works

	1.	Registration: Generates a salt and hashes the password. Both salt and hash are stored.
	2.	Login: Hashes the entered password with the stored salt and compares it to the stored hash.
Running the Code

	1.	Clone this repository:  git clone https://github.com/Appash047/Hashing-with-Salting

 2.	Compile and run the Main.java class in your IDE or from the command line.

