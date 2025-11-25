package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class BrowserFactory {

    private BrowserFactory() {}

    public static WebDriver createDriver(String browser) {

        String b = browser == null ? "chrome" : browser.toLowerCase().trim();

        switch (b) {

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions ff = new FirefoxOptions();
                ff.addArguments("--start-maximized");
                return new FirefoxDriver(ff);

            case "edge":
                // ❗ USE LOCAL DRIVER – DO NOT USE WebDriverManager
                System.setProperty("webdriver.edge.driver",
                        "D:\\edge\\edgedriver_win64\\msedgedriver.exe");

                EdgeOptions edge = new EdgeOptions();
                edge.addArguments("--start-maximized");
                edge.addArguments("--disable-notifications");
                edge.addArguments("--remote-allow-origins=*");

                return new EdgeDriver(edge);

            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--disable-notifications");
                options.addArguments("--remote-allow-origins=*");
                return new ChromeDriver(options);
        }
    }
}