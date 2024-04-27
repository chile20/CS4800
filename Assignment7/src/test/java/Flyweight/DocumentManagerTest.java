package Flyweight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class DocumentManagerTest {
    private final String TEST_FILENAME = "test_document.ser";
    private Document testDocument;

    @BeforeEach
    void setUp() {
        // Create a Document with some characters
        testDocument = new Document();
        testDocument.addCharacter('x', "Arial", 12, "Black");
    }

    @AfterEach
    void tearDown() throws IOException {
        // Clean up: Delete the test file after each test
        Files.deleteIfExists(Path.of(TEST_FILENAME));
    }

    @Test
    void testSaveDocument() throws IOException {
        // Test saving the document
        DocumentManager.saveDocument(testDocument, TEST_FILENAME);
        assertTrue(Files.exists(Path.of(TEST_FILENAME)));
    }

    @Test
    void testLoadDocument() throws IOException, ClassNotFoundException {
        // First, save the document to a file
        DocumentManager.saveDocument(testDocument, TEST_FILENAME);

        // Now, load the document back from the file
        Document loadedDocument = DocumentManager.loadDocument(TEST_FILENAME);

        // Check that the loaded document is equal to the original document
        assertNotNull(loadedDocument);
        assertEquals(testDocument.getCharacters().size(), loadedDocument.getCharacters().size());
        assertEquals(testDocument.getCharacters().get(0).getCharacter(), loadedDocument.getCharacters().get(0).getCharacter());
    }
}
