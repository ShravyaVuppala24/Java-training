import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class CountStr {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\shrav\\IdeaProjects\\Hope\\src\\counting.txt";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using spaces as delimiter
                String[] words = line.split("\\s+");
                // Iterate over each word and check if it equals the search string
                for (String word : words) {
                    if (word.equals(s)) {
                        count++;
                    }
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }
}

