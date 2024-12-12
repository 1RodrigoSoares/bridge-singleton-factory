package factory;

import formatter.ReportFormatter;
import report.Report;
import report.InventoryReport;

public class InventoryReportFactory extends ReportFactory {
    @Override
    public Report createReport(ReportFormatter formatter) {
        return new InventoryReport(formatter);
    }
}
