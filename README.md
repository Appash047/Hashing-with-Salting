# Password Hashing with Salt in Java

This repository demonstrates how to securely hash passwords using salting in Java.

## Example Breakdown

### When the user registers:
- **Password**: `password123`
- **Random Salt**: `abc123`
- **Hashing process**: `hash(password123 + abc123)`
- **Store**: `salt = abc123` and `hashedPassword = hashResult` in the database.

### When the user logs in:
- **User enters**: `password123`
- **Retrieve**: the `salt abc123` from the database.
- **Combine**: entered password with the salt: `password123 + abc123`
- **Hash this combination**: `hash(password123 + abc123)`
- **Compare**: the new hash with the stored hashed password. If they match, authentication succeeds.

## Running the Code

1. Clone this repository:
   ```bash
   git clone https://github.com/Appash047/Hashing-with-Salting
   ```

2. Open the project in your IDE or navigate to the project folder in the terminal.
   ```

## How It Works
This project stores passwords using salting to ensure that even identical passwords result in different hashes, making it harder for attackers to crack them using precomputed hash tables (rainbow tables).
