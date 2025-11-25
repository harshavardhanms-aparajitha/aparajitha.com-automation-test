package headers_SanityTest;

import baseClass.BaseTest;
import locaters_urls.HomePageHeadersLocators;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class ProductsTests extends BaseTest {

    // ============================================================
    //                     PRODUCTS → TEST CASES
    // ============================================================

    @Test(priority = 1)
    public void verifySimplianceClassic() {
        hoverAndClick(
                HomePageHeadersLocators.PRODUCTS_DROPDOWN,
                HomePageHeadersLocators.PRODUCT_SIMPLIANCE_CLASSIC
        );

        Assert.assertTrue(
                waitForVisibility(By.xpath("//*[text()='Real-Time Labour Law Compliance Monitoring Tool ']"))
                        .isDisplayed(),
                "❌ Simpliance Classic page not opened!"
        );
    }

    @Test(priority = 2)
    public void verifySimplianceRemo() {
        hoverAndClick(
                HomePageHeadersLocators.PRODUCTS_DROPDOWN,
                HomePageHeadersLocators.PRODUCT_SIMPLIANCE_REMO
        );

        Assert.assertTrue(
                waitForVisibility(By.xpath("//*[text()='REMO:']")).isDisplayed(),
                "❌ Simpliance Remo page not opened!"
        );
    }

    @Test(priority = 3)
    public void verifySimplianceVendor() {
        hoverAndClick(
                HomePageHeadersLocators.PRODUCTS_DROPDOWN,
                HomePageHeadersLocators.PRODUCT_SIMPLIANCE_VENDOR
        );

        Assert.assertTrue(
                waitForVisibility(By.xpath("//*[text()='Simpliance ']")).isDisplayed(),
                "❌ Simpliance Vendor page not opened!"
        );
    }

    @Test(priority = 4)
    public void verifySimplianceAudit() {
        hoverAndClick(
                HomePageHeadersLocators.PRODUCTS_DROPDOWN,
                HomePageHeadersLocators.PRODUCT_SIMPLIANCE_AUDIT
        );

        Assert.assertTrue(
                waitForVisibility(By.xpath("//*[text()='Comprehensive  Audit Management Platform']")).isDisplayed(),
                "❌ Simpliance Audit page not opened!"
        );
    }
}