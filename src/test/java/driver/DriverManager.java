package driver;

import org.openqa.selenium.WebDriver;

/**
 * Thread-safe WebDriver holder using ThreadLocal.
 */
public final class DriverManager {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    private DriverManager() {}

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static void setDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }

    public static void quitDriver() {
        WebDriver driver = driverThreadLocal.get();
        try {
            if (driver != null) driver.quit();
        } catch (Exception ignored) {}
        driverThreadLocal.remove();
    }
}