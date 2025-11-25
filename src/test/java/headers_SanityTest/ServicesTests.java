package headers_SanityTest;

import baseClass.BaseTest;
import locaters_urls.HomePageHeadersLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ServicesTests extends BaseTest {

    // ============================================================
    //                     SERVICES → TEST CASES
    // ============================================================

    @Test(priority = 1)
    public void verifyComplianceRiskAudit() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_COMPLIANCE_RISK_AUDIT
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_RISK_AUDIT).isDisplayed(),
                "❌ Compliance Risk Audit page not opened!"
        );
    }

    @Test(priority = 2)
    public void verifyEstablishmentCompliances() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_ESTABLISHMENT_COMPLIANCES
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_ESTABLISHMENT).isDisplayed(),
                "❌ Establishment Compliances page not opened!"
        );
    }

    @Test(priority = 3)
    public void verifyPayrollComplianceServices() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_PAYROLL_COMPLIANCE_SERVICES
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_PAYROLL_COMPLIANCE).isDisplayed(),
                "❌ Payroll Compliance Services page not opened!"
        );
    }

    @Test(priority = 4)
    public void verifyFactoryComplianceServices() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_FACTORY_COMPLIANCE_SERVICES
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_FACTORY_COMPLIANCE).isDisplayed(),
                "❌ Factory Compliance Services page not opened!"
        );
    }

    @Test(priority = 5)
    public void verifyVendorComplianceServices() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_VENDOR_COMPLIANCE_SERVICES
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_VENDOR_COMPLIANCE).isDisplayed(),
                "❌ Vendor Compliance Services page not opened!"
        );
    }

    @Test(priority = 6)
    public void verifyMinesComplianceServices() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_MINES_COMPLIANCE_SERVICES
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_MINES_COMPLIANCE).isDisplayed(),
                "❌ Mines Compliance Services page not opened!"
        );
    }

    @Test(priority = 7)
    public void verifyFlexiStaffingServices() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_FLEXI_STAFFING_SERVICES
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_FLEXI_STAFFING).isDisplayed(),
                "❌ Flexi Staffing Services page not opened!"
        );
    }

    @Test(priority = 8)
    public void verifyPayrollServices() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_PAYROLL_SERVICES
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_PAYROLL).isDisplayed(),
                "❌ Payroll Services page not opened!"
        );
    }

    @Test(priority = 9)
    public void verifyEHS() {
        hoverAndClick(
                HomePageHeadersLocators.SERVICES_DROPDOWN,
                HomePageHeadersLocators.SERVICE_EHS
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.SERVICE_VALIDATE_EHS).isDisplayed(),
                "❌ Environmental, Health & Safety page not opened!"
        );
    }
}