package factory;

import formatter.ReportFormatter;
import report.Report;
import report.SalesReport;

public class SalesReportFactory extends ReportFactory {
    @Override
    public Report createReport(ReportFormatter formatter) {
        return new SalesReport(formatter);
    }
}
