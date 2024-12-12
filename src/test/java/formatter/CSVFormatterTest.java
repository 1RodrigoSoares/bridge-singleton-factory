package formatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CSVFormatterTest {

    @Test
    void testFormat() {
        CSVFormatter formatter = new CSVFormatter();
        String formatted = formatter.format("Test Content");

        assertEquals("CSV Format: Test Content", formatted, "Formatted output should match the expected pattern");
    }
}
