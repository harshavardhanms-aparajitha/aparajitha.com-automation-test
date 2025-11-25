package headers_SanityTest;

import locaters_urls.HomePageHeadersLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import baseClass.BaseTest;

public class LoginTests extends BaseTest {

    // Reusable click: Parent + Child + Switch Tab
    private void openLoginAndClick(By parentOption, By childOption) {

        // Hover Login → Hover Parent → Click Child
        hoverAndClick(HomePageHeadersLocators.LOGIN_DROPDOWN, parentOption);

        // Now click final child tab
        safeClick(childOption);

        // Switch to opened tab
        switchToNewTab();
    }

    // ================================
    //        CUSTOMER LOGIN (9)
    // ================================

    @Test(priority = 1)
    public void customer_remo_shouldOpenLogin() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_REMO);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_REMO);
        Assert.assertTrue(validate.isDisplayed(), "❌ Remo (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 2)
    public void customer_vendor_shouldOpenLogin() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_VENDOR);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_VENDOR);
        Assert.assertTrue(validate.isDisplayed(), "❌ Vendor (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 3)
    public void customer_classic_shouldOpenSignIn() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_CLASSIC);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_CLASSIC);
        Assert.assertTrue(validate.isDisplayed(), "❌ Classic (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 4)
    public void customer_remit_shouldOpenLogin() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_REMIT);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_REMIT);
        Assert.assertTrue(validate.isDisplayed(), "❌ Remit (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 5)
    public void customer_tams_shouldOpenSignIn() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_TAMS);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_TAMS);
        Assert.assertTrue(validate.isDisplayed(), "❌ TAMS (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 6)
    public void customer_audit_shouldOpenSignIn() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_AUDIT);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_AUDIT);
        Assert.assertTrue(validate.isDisplayed(), "❌ Audit (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 7)
    public void customer_elibraryLogin_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_ELIBRARY_LOGIN);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_ELIBRARY_LOGIN);
        Assert.assertTrue(validate.isDisplayed(), "❌ eLibrary (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 8)
    public void customer_ess_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_ESS);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_ESS);
        Assert.assertTrue(validate.isDisplayed(), "❌ ESS (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 9)
    public void customer_pf_esi_helpdesk_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_CUSTOMER,
                HomePageHeadersLocators.CUSTOMER_PF_ESI_HELPDESK);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.CUSTOMER_VALIDATE_PF_ESI);
        Assert.assertTrue(validate.isDisplayed(), "❌ PF & ESI Helpdesk (Customer) Login failed!");

        closeCurrentTabAndReturn();
    }

    // ================================
    //        EMPLOYEE LOGIN (12)
    // ================================

    @Test(priority = 10)
    public void employee_myPeople_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_MYPEOPLE);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_MYPEOPLE);
        Assert.assertTrue(validate.isDisplayed(), "❌ MyPeople Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 11)
    public void employee_collect_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_COLLECT);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_COLLECT);
        Assert.assertTrue(validate.isDisplayed(), "❌ Collect Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 12)
    public void employee_expenses_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_EXPENSES);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_EXPENSES);
        Assert.assertTrue(validate.isDisplayed(), "❌ Expenses Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 13)
    public void employee_helpdesk_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_HELPDESK);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_HELPDESK);
        Assert.assertTrue(validate.isDisplayed(), "❌ Helpdesk Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 14)
    public void employee_recruit_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_RECRUIT);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_RECRUIT);
        Assert.assertTrue(validate.isDisplayed(), "❌ Recruit Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 15)
    public void employee_generalMasters_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_GENERAL_MASTERS);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_GENERAL_MASTERS);
        Assert.assertTrue(validate.isDisplayed(), "❌ General Masters Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 16)
    public void employee_statutoryMasters_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_STATUTORY_MASTERS);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_STATUTORY_MASTERS);
        Assert.assertTrue(validate.isDisplayed(), "❌ Statutory Masters Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 17)
    public void employee_userAdministration_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_USER_ADMINISTRATION);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_USER_ADMINISTRATION);
        Assert.assertTrue(validate.isDisplayed(), "❌ User Administration Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 18)
    public void employee_tams_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_TAMS);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_TAMS);
        Assert.assertTrue(validate.isDisplayed(), "❌ TAMS Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 19)
    public void employee_remoAdminVpn_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_REMO_ADMIN_VPN);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_REMO_ADMIN_VPN);
        Assert.assertTrue(validate.isDisplayed(), "❌ Remo Admin VPN Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 20)
    public void employee_remoSpLogin_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_REMO_SP_LOGIN);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_REMO_SP_LOGIN);
        Assert.assertTrue(validate.isDisplayed(), "❌ Remo SP Login failed!");

        closeCurrentTabAndReturn();
    }

    @Test(priority = 21)
    public void employee_classicAudit_shouldOpen() {
        openLoginAndClick(HomePageHeadersLocators.LOGIN_EMPLOYEE,
                HomePageHeadersLocators.EMPLOYEE_CLASSIC_AUDIT);

        WebElement validate = waitForVisibility(HomePageHeadersLocators.EMPLOYEE_VALIDATE_CLASSIC_AUDIT);
        Assert.assertTrue(validate.isDisplayed(), "❌ Classic Audit Login failed!");

        closeCurrentTabAndReturn();
    }
}