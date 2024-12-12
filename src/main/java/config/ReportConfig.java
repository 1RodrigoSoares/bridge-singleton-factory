package config;

public class ReportConfig {
    private static ReportConfig instance;
    private String configValue;

    private ReportConfig() {
        this.configValue = "Default Configuration";
    }

    public static ReportConfig getInstance() {
        if (instance == null) {
            instance = new ReportConfig();
        }
        return instance;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
