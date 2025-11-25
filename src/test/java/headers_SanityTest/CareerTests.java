package headers_SanityTest;

import locaters_urls.HomePageHeadersLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import baseClass.BaseTest;

public class CareerTests extends BaseTest {

    @Test(priority = 1)
    public void verifyCareerPageAndApplyNow() {

        // ========== Click "Career" (opens new tab) ==========
       // WebElement careerLink = waitForVisibility(HomePageHeadersLocators.CAREER_LINK);
        safeClick(HomePageHeadersLocators.CAREER_LINK);

        // ========== Switch to new tab ==========
        switchToNewTab();

        // ========== Validate career main text ==========
        WebElement careerText = waitForVisibility(HomePageHeadersLocators.CAREER_VALIDATE_TEXT);
        Assert.assertTrue(careerText.isDisplayed(),
                "❌ Career page main text is not visible!");

        // ========== Validate 'View Openings' button ==========
        By viewOpeningsBtn = By.xpath("//*[text()='View Openings']");
        WebElement viewOpeningsButton = waitForVisibility(viewOpeningsBtn);

        Assert.assertTrue(viewOpeningsButton.isDisplayed(),
                "❌ 'View Openings' button is not visible!");

        // ========== Close child tab and return ==========
        closeCurrentTabAndReturn();
    }
}