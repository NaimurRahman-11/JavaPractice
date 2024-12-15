import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.regex.*;

public class ExtractTransactionId {
    public static void main(String[] args) {

        String filePath = "E:\\Java\\JavaPractice\\src\\main\\resources\\txn.html";


        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }


            Pattern pattern = Pattern.compile("Transaction Id: (TXN\\d+)");
            Matcher matcher = pattern.matcher(content);

            if (matcher.find()) {
                System.out.println("Transaction Id: " + matcher.group(1));
            } else {
                System.out.println("Transaction Id not found.");
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
