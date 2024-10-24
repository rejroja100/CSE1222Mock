import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {

    public static void main(String[] args) {

        String word = args[0];

        for (int i = 1; i < args.length; i++) {
            searchInFile(word, args[i]);
        }
    }

    private static void searchInFile(String word, String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    System.out.println(filename + ": " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + filename + ": " + e.getMessage());
        }
    }
}
