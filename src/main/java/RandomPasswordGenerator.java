import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        System.out.println("Generated Password: " + generatePassword(8));
    }

    public static String generatePassword(int length) {
        if (length < 8) return "Password length should be at least 8 characters.";

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?";

        String allChars = upper + lower + digits + specialChars;
        Random random = new Random();

        String password = "" +
                upper.charAt(random.nextInt(upper.length())) +
                lower.charAt(random.nextInt(lower.length())) +
                digits.charAt(random.nextInt(digits.length())) +
                specialChars.charAt(random.nextInt(specialChars.length()));

        for (int i = password.length(); i < length; i++) {
            password += allChars.charAt(random.nextInt(allChars.length()));
        }

        char[] passwordArray = password.toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = temp;
        }

        return new String(passwordArray);
    }
}
