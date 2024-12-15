import java.util.Scanner;

public class BinaryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isBinary = isBinaryString(input);

        System.out.println(isBinary ? "true" : "false");

        scanner.close();
    }

    public static boolean isBinaryString(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
