import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileManagerTest {
    private static final String TEST_FILE_PATH = "test1.txt";
    private static final String TEST_CONTENT = "Hello,This is a test file.";
    @Test
    void testReadTextFile() {
          try {
            // Write content to file
            FileManager.writeTextFile(TEST_FILE_PATH, TEST_CONTENT);

            // Read content from file
            String readContent = FileManager.readTextFile(TEST_FILE_PATH);

            // Verify that the read content matches the written content
            assertEquals(TEST_CONTENT, readContent);
        } catch (IOException e) {
            fail("Exception not expected: " + e.getMessage());
        } finally {
            FileManager.deleteTextFile(TEST_FILE_PATH);
        }
    }

    @Test
    void testWriteTextFile() {
        try {
            // Write content to file
            FileManager.writeTextFile(TEST_FILE_PATH, TEST_CONTENT);

            // Read content from file to verify it was written correctly
            String readContent = FileManager.readTextFile(TEST_FILE_PATH);

            // Verify that the read content matches the written content
            assertEquals(TEST_CONTENT, readContent);
        } catch (IOException e) {
            fail("Exception not expected: " + e.getMessage());
        }  finally {
            FileManager.deleteTextFile(TEST_FILE_PATH);
        }
    }

    @Test
    void testDeleteTextFile() {
        try {
            // Write content to file
            FileManager.writeTextFile(TEST_FILE_PATH, TEST_CONTENT);

            // Read content from file to verify it was written correctly
            String readContent = FileManager.readTextFile(TEST_FILE_PATH);

            // Verify that the read content matches the written content
            assertEquals(TEST_CONTENT, readContent);
        } catch (IOException e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }
}
