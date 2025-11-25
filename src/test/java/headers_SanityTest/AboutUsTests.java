package headers_SanityTest;

import locaters_urls.HomePageHeadersLocators;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import baseClass.BaseTest;

public class AboutUsTests extends BaseTest {

    // ===================== TEST CASES ===================== //

    @Test(priority = 1)
    public void verifyOurCompanyTab() {
        hoverAndClick(HomePageHeadersLocators.ABOUTUS_DROPDOWN,
                      HomePageHeadersLocators.ABOUT_US_OUR_COMPANY);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ABOUT_US_VALIDATE_OUR_COMPANY);
        Assert.assertTrue(validate.isDisplayed(), "❌ 'Our Company' page did not load!");
    }

    @Test(priority = 2)
    public void verifyManagementTab() {
        hoverAndClick(HomePageHeadersLocators.ABOUTUS_DROPDOWN,
                      HomePageHeadersLocators.ABOUT_US_MANAGEMENT);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ABOUT_US_VALIDATE_MANAGEMENT);
        Assert.assertTrue(validate.isDisplayed(), "❌ 'Management' page did not load!");
    }

    @Test(priority = 3)
    public void verifyOurClientsTab() {
        hoverAndClick(HomePageHeadersLocators.ABOUTUS_DROPDOWN,
                      HomePageHeadersLocators.ABOUT_US_OUR_CLIENTS);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ABOUT_US_VALIDATE_OUR_CLIENTS);
        Assert.assertTrue(validate.isDisplayed(), "❌ 'Our Clients' page did not load!");
    }

    @Test(priority = 4)
    public void verifyContactUsTab() {
        hoverAndClick(HomePageHeadersLocators.ABOUTUS_DROPDOWN,
                      HomePageHeadersLocators.ABOUT_US_CONTACT_US);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ABOUT_US_VALIDATE_CONTACT_US);
        Assert.assertTrue(validate.isDisplayed(), "❌ 'Contact Us' page did not load!");
    }

    @Test(priority = 5)
    public void verifyTestimonialsTab() {
        hoverAndClick(HomePageHeadersLocators.ABOUTUS_DROPDOWN,
                      HomePageHeadersLocators.ABOUT_US_TESTIMONIALS);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.ABOUT_US_VALIDATE_TESTIMONIALS);
        Assert.assertTrue(validate.isDisplayed(), "❌ 'Testimonials' page did not load!");
    }
}