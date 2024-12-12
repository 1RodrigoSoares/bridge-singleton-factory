package report;

import formatter.ReportFormatter;

public class SalesReport extends Report {
    public SalesReport(ReportFormatter formatter) {
        super(formatter);
    }

    @Override
    public void generate(String content) {
        System.out.println("Sales Report: " + formatter.format(content));
    }
}
