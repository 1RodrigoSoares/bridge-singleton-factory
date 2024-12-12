package config;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReportConfigTest {

    @Test
    void testSingletonInstance() {
        ReportConfig instance1 = ReportConfig.getInstance();
        ReportConfig instance2 = ReportConfig.getInstance();

        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    void testConfigValue() {
        ReportConfig config = ReportConfig.getInstance();
        config.setConfigValue("New Value");

        assertEquals("New Value", config.getConfigValue(), "Config value should match the set value");
    }
}
