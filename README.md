Password Hashing with Salt in Java

Example Breakdown:
When the user registers:
	•	Password: password123
	•	Random Salt: abc123
	•	Hashing process: hash(password123 + abc123)
	•	Store salt = abc123 and hashedPassword = hashResult in the database.

When the user logs in:
	•	User enters: password123
	•	Retrieve the salt abc123 from the database.
	•	Combine entered password with salt: password123 + abc123
	•	Hash this combination: hash(password123 + abc123)
	•	Compare this hash with the stored hashed password.
 
Running the Code

		Clone this repository:  git clone https://github.com/Appash047/Hashing-with-Salting

Compile and run the Main.java class in your IDE or from the command line.

