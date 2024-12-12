package formatter;

public class PDFFormatter implements ReportFormatter {
    @Override
    public String format(String content) {
        return "PDF Format: " + content;
    }
}
