public class Main {
    public static void main(String[] args) throws Exception {
        // Register a new user
        String password = "securePassword123";
        String[] registrationData = PasswordUtil.registerUser(password);
        String salt = registrationData[0];
        String hashedPassword = registrationData[1];

        System.out.println("Salt: " + salt);
        System.out.println("Hashed Password: " + hashedPassword);

        // Later during login
        String enteredPassword = "securePassword123";  // User enters the password
        boolean isAuthenticated = PasswordValidator.validatePassword(enteredPassword, hashedPassword, salt);

        System.out.println("Authenticated: " + isAuthenticated);
    }
}
