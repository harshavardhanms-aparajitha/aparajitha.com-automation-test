package headers_SanityTest;

import locaters_urls.HomePageHeadersLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import baseClass.BaseTest;

public class ELibraryTests extends BaseTest {

    @Test(priority = 1)
    public void verifyLatestMinimumWages() {
        hoverAndClick(HomePageHeadersLocators.ELIBRARY_DROPDOWN,
                      HomePageHeadersLocators.ELIBRARY_LATEST_MIN_WAGES);

        switchToNewTab();

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ELIBRARY_VALIDATE_MIN_WAGE);
        Assert.assertTrue(validate.isDisplayed(), "Latest Minimum Wages page not loaded.");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 2)
    public void verifyProfessionalTax() {
        hoverAndClick(HomePageHeadersLocators.ELIBRARY_DROPDOWN,
                      HomePageHeadersLocators.ELIBRARY_PROFESSIONAL_TAX);

        switchToNewTab();

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ELIBRARY_VALIDATE_PROFESSIONAL_TAX);
        Assert.assertTrue(validate.isDisplayed(), "Professional Tax page not loaded.");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 3)
    public void verifyLabourWelfareFund() {
        hoverAndClick(HomePageHeadersLocators.ELIBRARY_DROPDOWN,
                      HomePageHeadersLocators.ELIBRARY_LABOUR_WELFARE_FUND);

        switchToNewTab();

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ELIBRARY_VALIDATE_LABOUR_WELFARE);
        Assert.assertTrue(validate.isDisplayed(), "Labour Welfare Fund page not loaded.");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 4)
    public void verifyLeaveWorkingHours() {
        hoverAndClick(HomePageHeadersLocators.ELIBRARY_DROPDOWN,
                      HomePageHeadersLocators.ELIBRARY_LEAVE_WORKING_HOURS);

        switchToNewTab();

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ELIBRARY_VALIDATE_LEAVE_WORKING_HOURS);
        Assert.assertTrue(validate.isDisplayed(), "Leave & Working Hours page not loaded.");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 5)
    public void verifyHolidaysList() {
        hoverAndClick(HomePageHeadersLocators.ELIBRARY_DROPDOWN,
                      HomePageHeadersLocators.ELIBRARY_HOLIDAYS_LIST);

        switchToNewTab();

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ELIBRARY_VALIDATE_HOLIDAYS);
        Assert.assertTrue(validate.isDisplayed(), "Holidays List page not loaded.");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 6)
    public void verifyProvidentFund() {
        hoverAndClick(HomePageHeadersLocators.ELIBRARY_DROPDOWN,
                      HomePageHeadersLocators.ELIBRARY_PROVIDENT_FUND);

        switchToNewTab();

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ELIBRARY_VALIDATE_PROVIDENT_FUND);
        Assert.assertTrue(validate.isDisplayed(), "Provident Fund page not loaded.");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 7)
    public void verifyLEIComplianceCalendarPDF() {
        Actions actions = new Actions(driver);
        actions.moveToElement(waitForVisibility(HomePageHeadersLocators.ELIBRARY_DROPDOWN)).perform();
        waitForVisibility(HomePageHeadersLocators.ELIBRARY_LEI_COMPLIANCE_CALENDAR).click();

        switchToNewTab();

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("calendar.pdf"),
                "LEI Compliance Calendar PDF URL mismatch! Actual: " + currentURL);

        closeCurrentTabAndReturn();
    }

    @Test(priority = 8)
    public void verifyFCCComplianceCalendarPDF() {
        Actions actions = new Actions(driver);
        actions.moveToElement(waitForVisibility(HomePageHeadersLocators.ELIBRARY_DROPDOWN)).perform();
        waitForVisibility(HomePageHeadersLocators.ELIBRARY_FCC_COMPLIANCE_CALENDAR).click();

        switchToNewTab();

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("Compliance_Calendar_FCC.pdf"),
                "FCC Compliance Calendar PDF URL mismatch! Actual: " + currentURL);

        closeCurrentTabAndReturn();
    }
}