package formatter;

public class CSVFormatter implements ReportFormatter {
    @Override
    public String format(String content) {
        return "CSV Format: " + content;
    }
}
