package report;

import formatter.CSVFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventoryReportTest {

    @Test
    void testGenerate() {
        CSVFormatter formatter = new CSVFormatter();
        InventoryReport report = new InventoryReport(formatter);

        assertDoesNotThrow(() -> report.generate("Inventory Data"));
    }
}
