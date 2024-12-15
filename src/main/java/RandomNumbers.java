import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.print("Generated numbers: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
    }
}
