import java.util.Scanner;

public class BinarySearchCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.30, 3.32, 3.43, 3.48, 3.50, 3.52, 3.60, 3.63, 3.75, 3.86};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CGPA to search: ");
        double target = scanner.nextDouble();

        int low = 0, high = cgpa.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (cgpa[mid] == target) {
                found = true;
                break;
            } else if (cgpa[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(found ? "CGPA found" : "CGPA not found");
    }
}
