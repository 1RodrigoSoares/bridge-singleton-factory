package factory;

import formatter.PDFFormatter;
import report.Report;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalesReportFactoryTest {

    @Test
    void testCreateReport() {
        SalesReportFactory factory = new SalesReportFactory();
        Report report = factory.createReport(new PDFFormatter());

        assertNotNull(report, "The report instance should not be null");
        assertTrue(report instanceof report.SalesReport, "The report should be an instance of SalesReport");
    }
}
