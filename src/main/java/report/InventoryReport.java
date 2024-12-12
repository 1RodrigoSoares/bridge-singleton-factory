package report;

import formatter.ReportFormatter;

public class InventoryReport extends Report {
    public InventoryReport(ReportFormatter formatter) {
        super(formatter);
    }

    @Override
    public void generate(String content) {
        System.out.println("Inventory Report: " + formatter.format(content));
    }
}
