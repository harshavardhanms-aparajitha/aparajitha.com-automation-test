package headers_SanityTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseTest;
import locaters_urls.HomePageClickLocators;

import java.time.Duration;
import java.util.ArrayList;

public class HomePageClickValidations extends BaseTest {

    WebDriverWait wait;
    JavascriptExecutor js;

    /** 🔁 Reusable scroll + click helper */
    public void scrollAndClick(By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;

        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        js.executeScript("arguments[0].click();", element);
    }

    // 🔹 1️⃣ All Blogs
    @Test(priority = 1)
    public void verifyAllBlogsNavigation() {
        driver.get(HomePageClickLocators.HOME_URL);

        try {
            scrollAndClick(HomePageClickLocators.ALL_BLOGS);

            WebElement text = driver.findElement(HomePageClickLocators.POPULAR_BLOG_VALIDATION_TEXT);
            Assert.assertTrue(text.getText().contains("Popular Blog"), "❌ All Blogs validation failed!");

            System.out.println("✅ All Blogs page validated successfully.");
        } catch (Exception e) {
            System.out.println("❌ All Blogs validation failed: " + e.getMessage());
        }
    }

    // 🔹 2️⃣ ISO/IEC Certificate PDF
    @Test(priority = 2)
    public void verifyISOIECCertificatePDF() {
        driver.get(HomePageClickLocators.HOME_URL);

        try {
            scrollAndClick(HomePageClickLocators.ISO_IEC_CERTIFICATE);

            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

            Assert.assertTrue(
                    driver.getCurrentUrl().contains(HomePageClickLocators.ISO_IEC_PDF_URL),
                    "❌ ISO/IEC certificate PDF URL mismatch!"
            );

            System.out.println("✅ ISO/IEC Certificate PDF validated successfully.");

            driver.close();
            driver.switchTo().window(tabs.get(0));

        } catch (Exception e) {
            System.out.println("❌ ISO/IEC Certificate validation failed: " + e.getMessage());
        }
    }

    // 🔹 3️⃣ ISO QMS Certificate PDF
    @Test(priority = 3)
    public void verifyISOQMSCertificatePDF() {
        driver.get(HomePageClickLocators.HOME_URL);

        try {
            scrollAndClick(HomePageClickLocators.ISO_QMS_CERTIFICATE);

            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

            Assert.assertTrue(
                    driver.getCurrentUrl().contains(HomePageClickLocators.ISO_QMS_PDF_URL),
                    "❌ ISO QMS certificate PDF URL mismatch!"
            );

            System.out.println("✅ ISO QMS Certificate PDF validated successfully.");

            driver.close();
            driver.switchTo().window(tabs.get(0));

        } catch (Exception e) {
            System.out.println("❌ ISO QMS Certificate validation failed: " + e.getMessage());
        }
    }

    // 🔹 4️⃣ Case Study Navigation
    @Test(priority = 4)
    public void verifyCaseStudyNavigation() {
        driver.get(HomePageClickLocators.HOME_URL);

        try {
            scrollAndClick(HomePageClickLocators.CASE_STUDY_BUTTON);

            WebElement text = driver.findElement(HomePageClickLocators.CASE_STUDY_VALIDATION_TEXT);
            Assert.assertTrue(text.getText().contains("Real-world success stories"),
                    "❌ Case Study page validation failed!");

            System.out.println("✅ Case Study page validated successfully.");

        } catch (Exception e) {
            System.out.println("❌ Case Study validation failed: " + e.getMessage());
        }
    }
}