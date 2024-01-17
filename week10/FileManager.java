import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    public static String readTextFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) { 
                content.append(line).append(System.lineSeparator());
            }
            return content.toString();
        }
    }

    public static void writeTextFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
       public static void deleteTextFile(String filePath) {
        try {
            // Delete the test file if it exists
            Files.deleteIfExists(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String filePath = "test.txt";
        String contentToWrite = "Hello, World!";

        try {
            writeTextFile(filePath, contentToWrite);

            String contentRead = readTextFile(filePath);
            System.out.println("Read from file: " + contentRead);

            deleteTextFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
