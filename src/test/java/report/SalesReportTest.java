package report;

import formatter.PDFFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalesReportTest {

    @Test
    void testGenerate() {
        PDFFormatter formatter = new PDFFormatter();
        SalesReport report = new SalesReport(formatter);

        assertDoesNotThrow(() -> report.generate("Sales Data"));
    }
}
