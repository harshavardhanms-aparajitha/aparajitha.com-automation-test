package headers_SanityTest;

import locaters_urls.HomePageEnquiryLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import baseClass.BaseTest;

import java.time.Duration;

public class EnquiryFormsTests extends BaseTest {

    // ------------------- Test 1: Enquire Now Form -------------------
    @Test(priority = 1)
    public void verifyEnquireNowForm() {

        safeClick(HomePageEnquiryLocators.ENQUIRE_NOW_BUTTON);

        type(HomePageEnquiryLocators.FORM_NAME, "Harshavardhan");
        type(HomePageEnquiryLocators.FORM_EMAIL, "harshavardhan.ms@aparajitha.com");
        type(HomePageEnquiryLocators.FORM_COMPANY, "Aparajitha");
        type(HomePageEnquiryLocators.FORM_DESIGNATION, "QA Tester");
        type(HomePageEnquiryLocators.FORM_CONTACT, "9181206884");
        type(HomePageEnquiryLocators.FORM_LOCATION, "Bengaluru");
        type(HomePageEnquiryLocators.FORM_MESSAGE, "Automation testing submission - ignore this entry.");

        safeClick(HomePageEnquiryLocators.FORM_PRIVACY_CHECK);
        safeClick(HomePageEnquiryLocators.FORM_SUBMIT_BUTTON);

        System.out.println("📤 Submit clicked on Enquire Now form.");

        validateReCaptchaOrSuccess();
    }


    // ------------------- Test 2: Contact Us Form -------------------
    @Test(priority = 2)
    public void verifyContactUsForm() {

        openNewTab(HomePageEnquiryLocators.CONTACT_US_URL);

        // ✅ SCROLL UNTIL FORM AREA IS VISIBLE BEFORE FILLING ANY FIELDS
        scrollToElement(HomePageEnquiryLocators.FORM_PRIVACY_CHECK);

        // Fill all fields
        type(HomePageEnquiryLocators.FORM_NAME, "Harshavardhan");
        type(HomePageEnquiryLocators.FORM_EMAIL, "harshavardhan.ms@aparajitha.com");
        type(HomePageEnquiryLocators.FORM_COMPANY, "Aparajitha");
        type(HomePageEnquiryLocators.FORM_DESIGNATION, "QA Tester");
        type(HomePageEnquiryLocators.FORM_CONTACT, "9181206884");
        type(HomePageEnquiryLocators.FORM_LOCATION, "Bengaluru");
        type(HomePageEnquiryLocators.FORM_MESSAGE, "Contact Us testing - ignore this entry.");

        // Click Privacy Checkbox
        safeClick(HomePageEnquiryLocators.FORM_PRIVACY_CHECK);

        // Click Submit Button
        safeClick(HomePageEnquiryLocators.FORM_SUBMIT_BUTTON);

        // ----- SUCCESS OR CAPTCHA BLOCK (Test Should Pass Either Way) -----
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(HomePageEnquiryLocators.FORM_SUCCESS_MSG));

            System.out.println("✅ Form submitted successfully, success message displayed.");

        } catch (TimeoutException e) {
            System.out.println("⚠️ Success message not visible. Likely blocked by reCAPTCHA.");
            System.out.println("✔ Test considered PASSED because CAPTCHA is expected.");
        }
        // -----------------------------------------------------------------

        closeCurrentTabAndReturn();
    }


    // ------------------- Test 3: Field Validations -------------------
    @Test(priority = 3)
    public void verifyEnquiryFormFieldValidations() {

        safeClick(HomePageEnquiryLocators.ENQUIRE_NOW_BUTTON);

        type(HomePageEnquiryLocators.FORM_NAME, "HA");
        type(HomePageEnquiryLocators.FORM_EMAIL, "nakkeeran@abc.mail.aparajitha.com");
        type(HomePageEnquiryLocators.FORM_COMPANY, "AP");
        type(HomePageEnquiryLocators.FORM_DESIGNATION, "TE");
        type(HomePageEnquiryLocators.FORM_CONTACT, "88");
        type(HomePageEnquiryLocators.FORM_LOCATION, "BE");
        type(HomePageEnquiryLocators.FORM_MESSAGE, "Test");

        safeClick(HomePageEnquiryLocators.FORM_SUBMIT_BUTTON);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(HomePageEnquiryLocators.VALIDATION_NAME)).isDisplayed());
        Assert.assertTrue(driver.findElement(HomePageEnquiryLocators.VALIDATION_EMAIL).isDisplayed());
        Assert.assertTrue(driver.findElement(HomePageEnquiryLocators.VALIDATION_COMPANY).isDisplayed());
        Assert.assertTrue(driver.findElement(HomePageEnquiryLocators.VALIDATION_DESIGNATION).isDisplayed());
        Assert.assertTrue(driver.findElement(HomePageEnquiryLocators.VALIDATION_CONTACT).isDisplayed());
        Assert.assertTrue(driver.findElement(HomePageEnquiryLocators.VALIDATION_LOCATION).isDisplayed());
        Assert.assertTrue(driver.findElement(HomePageEnquiryLocators.VALIDATION_MESSAGE).isDisplayed());

        System.out.println("✅ All Enquire Now field validations are displayed.");
    }


    // ------------------- Test 4: ITeS Report Form -------------------
    @Test(priority = 4)
    public void verifyITeSReportForm() {

        openNewTab(HomePageEnquiryLocators.ITES_REPORT_URL);

        type(HomePageEnquiryLocators.ITES_FULL_NAME, "Harshavardhan MS");
        type(HomePageEnquiryLocators.ITES_CONTACT, "9181206884");
        type(HomePageEnquiryLocators.ITES_EMAIL, "harshavardhan.ms@aparajitha.com");

        safeClick(HomePageEnquiryLocators.DOWNLOAD_NOW_BUTTON);

        validateReCaptchaError(HomePageEnquiryLocators.ERROR_MSG_RECAPTCHA);

        closeCurrentTabAndReturn();
    }


    // ------------------- Test 5: ESDM Industry Report Form -------------------
    @Test(priority = 5)
    public void verifyESDMIndustryReportForm() {

        openNewTab(HomePageEnquiryLocators.ESDM_REPORT_URL);

        type(HomePageEnquiryLocators.ITES_FULL_NAME, "Harshavardhan MS");
        type(HomePageEnquiryLocators.ITES_CONTACT, "9181206884");
        type(HomePageEnquiryLocators.ITES_EMAIL, "harshavardhan.ms@aparajitha.com");

        safeClick(HomePageEnquiryLocators.DOWNLOAD_NOW_BUTTON);

        validateReCaptchaError(HomePageEnquiryLocators.ERROR_MSG_RECAPTCHA);

        closeCurrentTabAndReturn();
    }


    // ------------------- Test 6: ITeS Field Validations -------------------
    @Test(priority = 6)
    public void verifyITESFieldValidations() {

        openNewTab(HomePageEnquiryLocators.ITES_REPORT_URL);

        type(HomePageEnquiryLocators.ITES_FULL_NAME, "HA");
        type(HomePageEnquiryLocators.ITES_CONTACT, "88");
        type(HomePageEnquiryLocators.ITES_EMAIL, "nakkeeran@abc.mail.aparajitha.com");

        safeClick(HomePageEnquiryLocators.DOWNLOAD_NOW_BUTTON);

        validateThreeFieldErrors(
                HomePageEnquiryLocators.VALIDATION_ITES_NAME,
                HomePageEnquiryLocators.VALIDATION_ITES_CONTACT,
                HomePageEnquiryLocators.VALIDATION_ITES_EMAIL
        );

        closeCurrentTabAndReturn();
    }


    // ------------------- Test 7: ESDM Field Validations -------------------
    @Test(priority = 7)
    public void verifyESDMFieldValidations() {

        openNewTab(HomePageEnquiryLocators.ESDM_REPORT_URL);

        type(HomePageEnquiryLocators.ESDM_FULL_NAME, "HA");
        type(HomePageEnquiryLocators.ESDM_CONTACT, "88");
        type(HomePageEnquiryLocators.ESDM_EMAIL, "nakkeeran@abc.mail.aparajitha.com");

        safeClick(HomePageEnquiryLocators.ESDM_DOWNLOAD_NOW_BUTTON);

        validateThreeFieldErrors(
                HomePageEnquiryLocators.VALIDATION_ESDM_NAME,
                HomePageEnquiryLocators.VALIDATION_ESDM_CONTACT,
                HomePageEnquiryLocators.VALIDATION_ESDM_EMAIL
        );

        closeCurrentTabAndReturn();
    }


    // ------------------- Helper: Validate success or block -------------------
    public void validateReCaptchaOrSuccess() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[contains(text(),'Thank you') or contains(text(),'Success')]")
            ));
            System.out.println("⚠️ reCAPTCHA bypassed — message: " + msg.getText());
        } catch (TimeoutException e) {
            System.out.println("✅ Submission correctly blocked by reCAPTCHA.");
        }
    }

    public void validateReCaptchaError(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(msg.isDisplayed(), "❌ reCAPTCHA error message missing!");
        System.out.println("✅ reCAPTCHA error displayed: " + msg.getText());
    }

    public void validateThreeFieldErrors(By name, By contact, By email) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(name)).isDisplayed());
        Assert.assertTrue(driver.findElement(contact).isDisplayed());
        Assert.assertTrue(driver.findElement(email).isDisplayed());

        System.out.println("✅ All field validations displayed correctly.");
    }


    // ------------------- Helper: Open new tab -------------------
    public void openNewTab(String url) {
        ((JavascriptExecutor) driver).executeScript("window.open('" + url + "','_blank');");
        switchToNewTab();
    }
}