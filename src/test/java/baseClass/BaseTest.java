package baseClass;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import driver.BrowserFactory;
import driver.DriverManager;
import utilities.ExtentManager;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Set;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ExtentTest test;

    // ========================= BEFORE METHOD ========================= //
    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser, Method method) {

        // Extent test node creation
        test = ExtentManager.getExtentReports().createTest(method.getName());

        // Create WebDriver thread-safe
        DriverManager.setDriver(BrowserFactory.createDriver(browser));
        driver = getDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        test.log(Status.INFO, "Launching browser → " + browser);

        driver.get("https://aparajitha.com/");
        test.log(Status.INFO, "Navigated to Aparajitha");
    }

    // ========================= AFTER METHOD ========================= //
    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {

        try {
            if (result.getStatus() == ITestResult.FAILURE) {
                String screenshotPath = captureScreenshot(result.getName());
                test.fail("Test Failed: " + result.getThrowable());
                test.addScreenCaptureFromPath(screenshotPath);
            } else if (result.getStatus() == ITestResult.SUCCESS) {
                test.pass("Test Passed");
            } else if (result.getStatus() == ITestResult.SKIP) {
                test.skip("Test Skipped");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        DriverManager.quitDriver();
    }

    // ========================= DRIVER HELPERS ========================= //

    protected WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    protected WebDriverWait getWait() {
        return wait;
    }

    // ========================= WAIT HELPERS ========================= //

    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickability(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // ========================= SENDKEYS/CLICK HELPERS ========================= //

    public void safeClick(By locator) {
        WebElement element = waitForVisibility(locator);
        waitForClickability(locator);
        element.click();
        test.log(Status.INFO, "Clicked → " + locator.toString());
    }

    public void type(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
        test.log(Status.INFO, "Typed: " + text + " → " + locator.toString());
    }

    // ========================= ACTIONS / HOVER ========================= //

    public void hover(By locator) {
        Actions actions = new Actions(driver);
        WebElement element = waitForVisibility(locator);
        actions.moveToElement(element).pause(Duration.ofMillis(300)).perform();
        test.log(Status.INFO, "Hovered → " + locator.toString());
    }

    public void hoverAndClick(By locator, By subLocator) {
        Actions actions = new Actions(driver);

        WebElement menu = waitForVisibility(locator);
        actions.moveToElement(menu).perform();
        test.log(Status.INFO, "Hovered main → " + locator.toString());

        WebElement submenu = waitForVisibility(subLocator);
        actions.moveToElement(submenu).click().perform();

        test.log(Status.INFO, "Clicked submenu → " + subLocator.toString());
    }

    // ========================= SCROLL ========================= //

    public void scrollToElement(By locator) {
        WebElement element = waitForVisibility(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        test.log(Status.INFO, "Scrolled to → " + locator.toString());
    }

    // ========================= TAB HANDLING ========================= //

    public void switchToNewTab() {
        String current = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();

        for (String tab : handles) {
            if (!tab.equals(current)) {
                driver.switchTo().window(tab);
                test.log(Status.INFO, "Switched to new tab → " + tab);
                return;
            }
        }
    }

    public void closeCurrentTabAndReturn() {
        String main = driver.getWindowHandles().iterator().next();
        driver.close();
        driver.switchTo().window(main);
        test.log(Status.INFO, "Closed tab and returned to main window");
    }

    // ========================= SCREENSHOT HELPERS ========================= //

    public String captureScreenshot(String testName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String path = System.getProperty("user.dir") +
                    "/screenshots/" + testName + "_" + System.currentTimeMillis() + ".png";

            File dest = new File(path);
            dest.getParentFile().mkdirs();
            Files.copy(src.toPath(), dest.toPath());

            return path;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}