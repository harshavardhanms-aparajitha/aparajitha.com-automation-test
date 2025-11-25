package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import driver.DriverManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Screenshot util that returns absolute path and Base64 (for embedding).
 */
public class ScreenshotUtil {

    private static final String SCREENSHOT_DIR = System.getProperty("user.dir") + File.separator + "screenshots";

    public static String captureScreenshotPNG(String testName) {
        WebDriver driver = DriverManager.getDriver();
        try {
            File dir = new File(SCREENSHOT_DIR);
            if (!dir.exists()) dir.mkdirs();

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = testName + "_" + timestamp + ".png";
            String path = dir + File.separator + fileName;

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File(path));
            return path;
        } catch (IOException | WebDriverException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String captureScreenshotBase64() {
        WebDriver driver = DriverManager.getDriver();
        try {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        } catch (WebDriverException e) {
            e.printStackTrace();
            return null;
        }
    }
}