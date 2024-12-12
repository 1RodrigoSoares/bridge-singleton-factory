package formatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PDFFormatterTest {

    @Test
    void testFormat() {
        PDFFormatter formatter = new PDFFormatter();
        String formatted = formatter.format("Test Content");

        assertEquals("PDF Format: Test Content", formatted, "Formatted output should match the expected pattern");
    }
}
