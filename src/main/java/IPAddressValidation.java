import java.util.Scanner;

public class IPAddressValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();

        System.out.println(isValidIP(ipAddress) ? "Valid IP" : "Invalid IP");
        scanner.close();
    }

    public static boolean isValidIP(String ipAddress) {
        String[] segments = ipAddress.split("\\.");
        if (segments.length != 4) return false;

        for (String segment : segments) {
            if (!segment.matches("\\d{1,3}") || Integer.parseInt(segment) > 255 || (segment.startsWith("0") && segment.length() > 1)) {
                return false;
            }
        }
        return true;
    }
}
