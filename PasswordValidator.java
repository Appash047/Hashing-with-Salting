public class PasswordValidator {

    // Validate password during login
    public static boolean validatePassword(String enteredPassword, String storedHash, String storedSalt) throws NoSuchAlgorithmException, InvalidKeySpecException {
        // Hash the entered password using the stored salt
        String hashedEnteredPassword = PasswordUtil.hashPassword(enteredPassword, storedSalt);
        return hashedEnteredPassword.equals(storedHash);  // Compare the two hashes
    }
}
