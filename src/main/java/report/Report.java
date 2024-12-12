package report;

import formatter.ReportFormatter;

public abstract class Report {
    protected ReportFormatter formatter;

    public Report(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public abstract void generate(String content);
}
