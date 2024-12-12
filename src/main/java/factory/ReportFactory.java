package factory;

import formatter.ReportFormatter;
import report.Report;

public abstract class ReportFactory {
    public abstract Report createReport(ReportFormatter formatter);
}
