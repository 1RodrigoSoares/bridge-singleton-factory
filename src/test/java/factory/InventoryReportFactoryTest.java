package factory;

import formatter.CSVFormatter;
import report.Report;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventoryReportFactoryTest {

    @Test
    void testCreateReport() {
        InventoryReportFactory factory = new InventoryReportFactory();
        Report report = factory.createReport(new CSVFormatter());

        assertNotNull(report, "The report instance should not be null");
        assertTrue(report instanceof report.InventoryReport, "The report should be an instance of InventoryReport");
    }
}
