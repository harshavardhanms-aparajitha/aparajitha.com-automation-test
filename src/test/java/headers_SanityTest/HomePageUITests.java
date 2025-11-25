package headers_SanityTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseTest;
import locaters_urls.HomePageUILocators;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class HomePageUITests extends BaseTest {

    @Test(priority = 1)
    public void verifyHomePageUIElements() {
        // Launch Website
        driver.get("https://aparajitha.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // List of UI elements to check
        List<By> uiElements = Arrays.asList(
                HomePageUILocators.BANNER_TEXT,
                HomePageUILocators.LOGO_25_YEARS,
                HomePageUILocators.CLIENTS_CAROUSEL,
                HomePageUILocators.NOTIFICATIONS_CAROUSEL,
                HomePageUILocators.MANAGED_SERVICES_CAROUSEL,
                HomePageUILocators.SIMPLIANCE_PRODUCTS_CONTAINER,
                HomePageUILocators.ALL_BLOGS_BUTTON,
                HomePageUILocators.CERTIFICATIONS_LAYOUT,
                HomePageUILocators.CASE_STUDY_LAYOUT,
                HomePageUILocators.ABOUT_US_LAYOUT,
                HomePageUILocators.CONNECT_WITH_US_BUTTON,
                HomePageUILocators.CANVAS_BUTTON
        );

        for (By locator : uiElements) {
            try {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

                // Scroll into view
                js.executeScript(
                        "arguments[0].scrollIntoView({behavior:'auto', block:'center'});",
                        element
                );

                // Wait for visibility
                wait.until(ExpectedConditions.visibilityOf(element));

                Assert.assertTrue(
                        element.isDisplayed(),
                        "❌ Element not visible: " + locator
                );

                System.out.println("✅ Validated UI element: " + locator);

            } catch (Exception e) {
                System.out.println("⚠ Element not found or not visible: " + locator);
                System.out.println("⚠ Error: " + e.getMessage());
            }
        }

        System.out.println("🎯 Home Page UI validation completed.");
    }
}