import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

    public class AllstrFile {
        public static void main(String[] args) {
            String filePath = "C:\\Users\\shrav\\IdeaProjects\\Hope\\src\\counting.txt";
            Map<String, Integer> stringCounts = countStringsInFile(filePath);

            // Print the counts
            for (Map.Entry<String, Integer> entry : stringCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        public static Map<String, Integer> countStringsInFile(String filePath) {
            Map<String, Integer> stringCounts = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+"); // Split the line into words
                    for (String word : words) {
                        // Update the count for each word
                        stringCounts.put(word, stringCounts.getOrDefault(word, 0) + 1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return stringCounts;
        }
    }

/// import java.io.BufferedReader;: This line imports the BufferedReader class from the java.io package. BufferedReader is used for efficient reading of characters from a character-input stream.
//
//import java.io.FileReader;: This line imports the FileReader class from the java.io package. FileReader is used to read characters from files.
//
//import java.io.IOException;: This line imports the IOException class from the java.io package. IOException is an exception that is thrown during input-output operations.
//
//import java.util.HashMap;: This line imports the HashMap class from the java.util package. HashMap is a data structure that stores key-value pairs and allows quick retrieval of values based on keys.
//
//import java.util.Map;: This line imports the Map interface from the java.util package. Map represents a collection of key-value pairs.

//public static void main(String[] args) {: This line declares the main method, which serves as the entry point for the program. The main method takes an array of String arguments as input.
//String filePath = "example.txt";: This line declares a String variable named filePath and assigns it the value "example.txt". This is the path to the file that will be read and processed. You should replace "example.txt" with the actual path to your file.
//Map<String, Integer> stringCounts = countStringsInFile(filePath);: This line declares a Map variable named stringCounts and assigns it the result of the countStringsInFile method. This method reads the content of the file, counts the occurrences of each string, and returns a Map containing the string counts.
//for (Map.Entry<String, Integer> entry : stringCounts.entrySet()) {: This line starts a for loop that iterates over the entries in the stringCounts map. Each entry represents a string and its count.
//
//System.out.println(entry.getKey() + ": " + entry.getValue());: This line prints the key (string) and value (count) of each entry in the map. entry.getKey() retrieves the string, and entry.getValue() retrieves the count.
//public static Map<String, Integer> countStringsInFile(String filePath) {: This line declares a method named countStringsInFile that takes a String parameter filePath representing the path to the file. The method returns a Map containing the counts of each string in the file.
//Map<String, Integer> stringCounts = new HashMap<>();: This line declares a Map variable named stringCounts and initializes it with a new HashMap instance. This map will store the counts of each string in the file.
//try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {: This line starts a try-with-resources block, which automatically closes the BufferedReader instance (reader) after the block executes. Inside the block, a BufferedReader is created to read from the file specified by filePath.
