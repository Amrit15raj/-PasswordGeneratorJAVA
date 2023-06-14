package programming;

import java.util.Random;

public class PasswordGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_-+=<>?";

    public static void main(String[] args) {
        int length = 10; // Length of the generated password
        boolean useNumbers = true; // Include numbers in the password
        boolean useSpecialCharacters = true; // Include special characters in the password

        String password = generatePassword(length, useNumbers, useSpecialCharacters);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, boolean useNumbers, boolean useSpecialCharacters) {
        String availableCharacters = CHARACTERS;
        if (useNumbers) {
            availableCharacters += NUMBERS;
        }
        if (useSpecialCharacters) {
            availableCharacters += SPECIAL_CHARACTERS;
        }

        Random random = new Random();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(availableCharacters.length());
            char randomChar = availableCharacters.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }

        return passwordBuilder.toString();
    }
}
